package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public class PowerUp implements GameObject {
	 private XY position;
	    private int points;
	 public PowerUp(XY position) {
	        this.points = 0;
	        this.position = position;
	    }

	    @Override
	    public void nextStep(GameObjectContext goc) {
	    }

		@Override
		public XY getLocation() {
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
			return "PowerUp (" + points + ")";
		}

}
