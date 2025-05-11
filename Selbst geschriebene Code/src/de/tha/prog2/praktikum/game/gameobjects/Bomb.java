package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public class Bomb implements GameObject {

    private int timer;
    private static final int DEFAULT_TIMER = 5;
    private XY position;
    private int points;

   
    public Bomb(XY position) {
        this.position =position;
        this.timer = DEFAULT_TIMER;
        this.points = 300;
        
    }

    @Override
    public void nextStep(GameObjectContext goc) {
        timer--;
        if (timer <= 0) {
            System.out.println("BOOM!");
        }
    }

    public int getTimer() {
        return timer;
    }

	@Override
	public XY getLocation() {
		
		return position;
	}

	@Override
	public void setLocation(XY position) {
		this.position = position;
		
	}

	@Override
	public int getPoints() {
		
		return points;
	}

	@Override
	public void updatePoints(int delta) {
	this.points += delta;
		
	}
	@Override
	public String toString() {
		return "Bomb (" + points + ")";
	}

	
}
