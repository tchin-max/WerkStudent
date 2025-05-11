package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public class Blast implements GameObject {
	

	    private XY position;
	    private int points;
	    private int duration;
	    private static final int DEFAULT_DURATION = 2;

	    public Blast(XY position) {
	        this.position = position;
	        this.points = 300;
	        this.duration = DEFAULT_DURATION;
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
	    public void nextStep(GameObjectContext goc) {
	        duration--;
	        if (duration <= 0) {
	            System.out.println("Blast verschwindet!");
	        }
	    }

	    public int getDuration() {
	        return duration;
	    }

	    @Override
	    public String toString() {
	        return "Blast (" + points + ")";
	    }
	}