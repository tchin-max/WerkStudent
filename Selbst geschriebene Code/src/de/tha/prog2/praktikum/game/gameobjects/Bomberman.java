package de.tha.prog2.praktikum.game.gameobjects;

import de.tha.prog2.praktikum.game.core.GameObjectContext;

import de.tha.prog2.praktikum.game.util.XY;
import java.util.*;

public class Bomberman implements GameObject {
	 private XY position;
	    private int points;
public Bomberman(XY position) {
	this.points = 0;
	this.position = position;
			
        
    }
@Override
public void nextStep(GameObjectContext goc) {
   
	Random random = new Random();
    int randomNumber = random.nextInt(4); // 0-3 Richtungen
    XY direction = null;

    switch (randomNumber) {
        case 0:
            direction = new XY(0, -1); 
            break;
        case 1:
            direction = new XY(0, 1); 
            break;
        case 2:
            direction = new XY(-1, 0); 
            break;
        case 3:
            direction = new XY(1, 0); 
            break;
    }

    if (direction != null) {
        // Versuche, die neue Position zu berechnen
        XY newPosition = this.position.move(direction);

        // Überprüfe, ob die neue Position innerhalb des Spielfelds liegt
        if (newPosition.getX() >= 0 && newPosition.getX() < goc.getSize().getX() &&
                newPosition.getY() >= 0 && newPosition.getY() < goc.getSize().getY()) {

            // Bewege den Bomberman über den GameObjectContext
            goc.move(this, direction);
        }
    }
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
	return "Bomberman (" + points + ")";
}
}
    

	
    