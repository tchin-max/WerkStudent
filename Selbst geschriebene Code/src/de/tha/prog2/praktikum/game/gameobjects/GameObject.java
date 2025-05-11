package de.tha.prog2.praktikum.game.gameobjects;

import java.util.Objects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.util.XY;

public interface  GameObject {
	
	
	XY getLocation();
    void setLocation(XY position);

    int getPoints();
    void updatePoints(int delta);

    void nextStep(GameObjectContext goc);
	
	/*
	 * private static int idCounter = 0; private final int id; private int points;
	 * protected XY position;
	 * 
	 * public GameObject(int points, XY position) { this.id = idCounter++;
	 * this.points = points; this.position = position; }
	 * 
	 * public int getId() { return id; }
	 * 
	 * public int getPoints() { return points; }
	 * 
	 * public XY getLocation() { return position; } public void setLocation(XY
	 * position) { this.position = position; }
	 * 
	 * public void updatePoints(int delta) { this.points += delta; }
	 * 
	 * public abstract void nextStep(GameObjectContext goc);
	 * 
	 * 
	 * 
	 * @Override public int hashCode() { return Objects.hash(id, points, position);
	 * }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; GameObject other = (GameObject) obj; return id == other.id && points
	 * == other.points && Objects.equals(position, other.position); }
	 * 
	 * @Override public String toString() { return "#" + id + ", points=" + points +
	 * ", position=" + position ; }
	 */
}
