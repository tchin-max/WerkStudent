package de.tha.prog2.praktikum.game.level;

import de.tha.prog2.praktikum.game.core.GameObjectSet;

import de.tha.prog2.praktikum.game.util.XY;

public interface LevelGenerator {
	
	public  XY getSize() ;
	
public GameObjectSet generate() ;
	

}
