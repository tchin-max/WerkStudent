package de.tha.prog2.praktikum.game.util;
import java.util.Scanner;

import de.tha.prog2.praktikum.game.core.Board;
import de.tha.prog2.praktikum.game.core.GameImpl;
import de.tha.prog2.praktikum.game.core.GameObjectContext;
import de.tha.prog2.praktikum.game.core.GameObjectSet;
import de.tha.prog2.praktikum.game.core.GameState;
import de.tha.prog2.praktikum.game.gameobjects.*;
import de.tha.prog2.praktikum.game.level.BasicGenerator;
import de.tha.prog2.praktikum.game.ui.ConsoleUI;
import de.tha.prog2.praktikum.game.util.XY;

public class Launcher {
	  public static void main(String[] args) {
		  
		
		  
		 
	        XY size = new XY(25, 25);
	        BasicGenerator levelGenerator = new BasicGenerator(size);

	  
	        Board board = new Board( levelGenerator);

	    
	        GameState gameState = new GameState( board);

	    
	        ConsoleUI ui = new ConsoleUI();

	       
	        GameImpl game = new GameImpl(gameState, ui);

	        
	        game.run();
	        
	    	/*
			 * GameObjectSet gameObjectSet = new GameObjectSet();
			 * 
			 * gameObjectSet.addObject(new Bomberman(new XY(1,1)));
			 * gameObjectSet.addObject(new Monster(new XY(2,2)));
			 * gameObjectSet.addObject(new Wall(new XY(0,0))); gameObjectSet.addObject(new
			 * DestructibleWall(new XY(3,3))); gameObjectSet.addObject(new PowerUp(new
			 * XY(4,4)));
			 * 
			 * System.out.print("__________________________________"); System.out.println();
			 * System.out.println("       Start des Spiels");
			 * 
			 * 
			 * 
			 * 
			 * while(true) { System.out.println("aktueller Zustand: ");
			 * System.out.println();
			 * 
			 * 
			 * System.out.println();
			 * 
			 * 
			 * Scanner sc = new Scanner(System.in); System.out.println(); System.out.
			 * println("gibt [Enter] für den nächsten Schritt oder, 'b' zum Beenden");
			 * 
			 * String input = sc.nextLine();
			 * 
			 * if (input.equalsIgnoreCase("b")) break;
			 * 
			 * gameObjectSet.nextStep(); }
			 * 
			 * System.out.println("Ende des Spiels");
			 * 
			 * 
			 * System.out.println(
			 * "-------------------------------------------------------------");
			 */
		  
}
	  
}
