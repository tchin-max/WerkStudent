package de.tha.prog2.praktikum.game.core;

import java.awt.Taskbar.State;

import de.tha.prog2.praktikum.game.gameobjects.Bomberman;
import de.tha.prog2.praktikum.game.ui.ConsoleUI;
import de.tha.prog2.praktikum.game.ui.MoveCommand;
import de.tha.prog2.praktikum.game.util.XY;

public class GameImpl extends Game{
	private final ConsoleUI ui;
	private final GameState gameState;
	
	public GameImpl(GameState gameState, ConsoleUI ui) {
		super(gameState);
		this.ui = ui;
		this.gameState = gameState;
	}



	

	@Override
	protected void processInput() {
		  MoveCommand command = ui.getCommand();//ragt Benutzer nach Eingabe
		//  moveBomberman(command);
	}
	
	/*
	 * private void moveBomberman(Movecommand command) { GameObjectSet gos =
	 * gameState.getBoard().getObject(); for (int i = 0; i < gos.size(); i++) { if
	 * (gos.get(i) instanceof Bomberman) { Bomberman bomberman = (Bomberman)
	 * gos.get(i); XY direction = null;
	 * 
	 * switch (command) { case UP: direction = new XY(0, -1); break; case DOWN:
	 * direction = new XY(0, 1); break; case LEFT: direction = new XY(-1, 0); break;
	 * case RIGHT: direction = new XY(1, 0); break; case QUIT: System.exit(0);
	 * break; case NONE: break; }
	 * 
	 * if (direction != null) { gameState.getBoard().flattened().move(bomberman,
	 * direction); } break; } } }
	 */


	@Override
	protected void render() {
	    ui.render(gameState.flattenBoard());//Zeigt das Spielfeld auf der Konsole
	}

	@Override
	protected void update() {//	Führt Spielaktionen aus (z. B. Bewegung, Logik)
		gameState.update();		
	}

}
