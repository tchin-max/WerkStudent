package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.ui.ConsoleUI;
import de.tha.prog2.praktikum.game.ui.MoveCommand;
import de.tha.prog2.praktikum.game.util.XY;

public class HandOperatedBomberman implements GameObject {
	private final ConsoleUI ui;
	 private XY position;
	    private int points;
	 public HandOperatedBomberman(XY position, ConsoleUI ui) {
	        this.points = 0;
	        this.ui = ui;
	        this.position = position;
	    }
	 
	 public  HandOperatedBomberman(XY position) {
		this(position,null);
		 
	 }

	    @Override
	    public void nextStep(GameObjectContext goc) {
	    	
	    	MoveCommand command = ui.getCommand();//„Welchen Befehl hat der Spieler eingegeben?“
	    	XY direction = command.OnMove();//Richtung berechnen
	    	
	    	goc.move(this, direction);//Verrichten der Bewegung
	    	
	        
	    }

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
			return "HandOperatedBomberman (" + points + ")";
		}
		
		
	

}
