package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public class DestructibleWall implements GameObject {

    private XY position;
    private int points;
	 public DestructibleWall(XY position) {
		 this.position = position;
		 this.points = 100;
	    }

	    @Override
	    public void nextStep(GameObjectContext goc) {
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
this.points += delta;			
		}
		@Override
		public String toString() {
			return "DestructibleWall (" + points + ")";
		}
}
