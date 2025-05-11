package de.tha.prog2.praktikum.game.core;

public abstract class Game {
	
	protected GameState state;
	public Game(GameState state) {
		
		this.state = state;
	}
	 public void run() {
		 while (true) {
		 render ();
		 processInput ();
		 update ();
		 }
		 }

	protected abstract void update() ;
		
	

	protected abstract void processInput();

	protected abstract void render();

}
