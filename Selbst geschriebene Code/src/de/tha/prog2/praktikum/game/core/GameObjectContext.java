package de.tha.prog2.praktikum.game.core;

import de.tha.prog2.praktikum.game.gameobjects.GameObject;

import de.tha.prog2.praktikum.game.util.XY;

public interface GameObjectContext {
	
	public XY getSize() ;
	
	public boolean move(GameObject gameObjects ,  XY direction) ;
		
	

}
