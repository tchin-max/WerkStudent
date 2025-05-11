package de.tha.prog2.praktikum.game.level;

import java.util.Iterator;

import de.tha.prog2.praktikum.game.core.GameObjectSet;
import de.tha.prog2.praktikum.game.gameobjects.Bomberman;
import de.tha.prog2.praktikum.game.gameobjects.Monster;
import de.tha.prog2.praktikum.game.gameobjects.Wall;
import de.tha.prog2.praktikum.game.util.XY;

public class BasicGenerator implements LevelGenerator {
	
	private final XY size ;
	

	public BasicGenerator(XY size) {
		
		this.size = size;
	}
	public BasicGenerator() {
		this.size = new XY(7,7);
	    
	}


	@Override
	public GameObjectSet generate() {
	GameObjectSet gameObjectSet = new GameObjectSet();
	for (int x = 0; x < size.getX(); x++) {
	
	gameObjectSet.addObject(new Wall(new XY(x,0)));//oben
	gameObjectSet.addObject(new Wall(new XY(x,size.getY()-1)));//unten
	}
	for (int y = 1; y < size.getY()-1; y++) {
		gameObjectSet.addObject(new Wall(new XY(0,y)));
		gameObjectSet.addObject(new Wall(new XY(size.getX()-1,y)));
		
	}  
	gameObjectSet.addObject(new Bomberman(new XY(3,3)));
	gameObjectSet.addObject(new Monster(new XY(2,2)));
	
	return gameObjectSet;
	}

	@Override
	public XY getSize() {
		// TODO Auto-generated method stub
		return size ;
	}

}
