package de.tha.prog2.praktikum.game.core;

import de.tha.prog2.praktikum.game.gameobjects.GameObject;
import de.tha.prog2.praktikum.game.util.XY;

public interface BoardView {
	
public GameObject getGameObject(int x, int y) ;
	


public XY getSize();


}
