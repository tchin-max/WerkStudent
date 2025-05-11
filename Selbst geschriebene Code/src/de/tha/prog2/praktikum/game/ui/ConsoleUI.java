package de.tha.prog2.praktikum.game.ui;

import java.util.Scanner;



import de.tha.prog2.praktikum.game.core.BoardView;
import de.tha.prog2.praktikum.game.core.GameObjectSet;
import de.tha.prog2.praktikum.game.gameobjects.GameObject;
import de.tha.prog2.praktikum.game.util.XY;
import de.tha.prog2.praktikum.game.ui.MoveCommand;

public class ConsoleUI implements UI {

	 private final Scanner scanner = new Scanner(System.in);

	    @Override
	    public MoveCommand getCommand() {
	        System.out.println("Enter command (up, down, left, right):");
	        String input = scanner.nextLine().trim().toLowerCase();//trim() entfernt die Leerzeichen vorne und hinten bei der Eingabe
	        
	        switch (input) {
	            case "up":
	                return MoveCommand.UP;
	            case "down":
	                return MoveCommand.DOWN;
	            case "left":
	                return MoveCommand.LEFT;
	            case "right":
	                return MoveCommand.RIGHT;
	          
	            default:
	                System.out.println("Invalid command.");
	                return MoveCommand.NONE;
	        }
	    }

	    @Override
	    public void render(BoardView view) {
	    	 XY size = view.getSize();
		        for (int y = 0; y < size.getY(); y++) {
		            for (int x = 0; x < size.getX(); x++) {
		                GameObject go = view.getGameObject(x, y);
		                if (go != null) {
		                    System.out.print(go.toString().charAt(0) + " "); //  Wenn ein Objekt da ist, gib den ersten Buchstaben seines Namens aus
		                } else {
		                    System.out.print(". "); // Leeres Feld darstellen
		                }
		            }
		            System.out.println();
		        }
		        }
	}
