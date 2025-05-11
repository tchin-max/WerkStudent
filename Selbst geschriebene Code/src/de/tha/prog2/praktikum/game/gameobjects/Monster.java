package de.tha.prog2.praktikum.game.gameobjects;

import java.util.*;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public class Monster implements GameObject {
	
	 private static final Random RANDOM = new Random();
	 private XY position;
	    private int points;

	    public Monster(XY position) {
	    	this.position = position;
	    	this.points = 300;
	    	 
	    }
	    
	   
	    @Override
	    public void nextStep(GameObjectContext goc) {
	       for (int a = 0; a < 4; a++) {
			
		

	        int randomNumber = RANDOM.nextInt(4); // 0-3 für 4 Richtungen
	        XY direction = null ;

	        switch (randomNumber) {
	            case 0:
	                direction = new XY(0, -1); // UP
	                break;
	            case 1:
	                direction = new XY(0, 1); // DOWN
	                break;
	            case 2:
	                direction = new XY(-1, 0); // LEFT
	                break;
	            case 3:
	                direction = new XY(1, 0); // RIGHT
	                break;
	        }

	        if (direction != null) {
	            XY newPosition = this.position.move(direction);

	            // in Spielfelds 
	            if (newPosition.getX() >= 0 && newPosition.getX() < goc.getSize().getX() &&
	                    newPosition.getY() >= 0 && newPosition.getY() < goc.getSize().getY()) {

	                // Bewege das Monster über den GameObjectContext
	                boolean moved =  goc.move(this, direction);
	                
	                if (moved) {
						break;
					}
	            }
	        }
	    }}

		@Override
		public XY getLocation() {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public void setLocation(XY position) {
			// TODO Auto-generated method stub
			this.position = position;
			
		}

		@Override
		public int getPoints() {
			// TODO Auto-generated method stub
			return points;
		}

		@Override
		public void updatePoints(int delta) {
			// TODO Auto-generated method stub
			this.points += delta;

			
		}
		@Override
		public String toString() {
			return "Monster (" + points + ")";
		}
	}