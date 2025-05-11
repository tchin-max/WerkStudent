package de.tha.prog2.praktikum.game.core;

import java.awt.geom.FlatteningPathIterator;

import de.tha.prog2.praktikum.game.util.XY;

public class GameState {
	 private int highScore;
	    private final Board board;

	    public GameState( Board board) {
	        this.board = board;
	    }
	    
	  

	    public int getHighScore() {
	        return highScore;
	    }

	    public void setHighScore(int highScore) {
	        this.highScore = highScore;
	    }

	    public FlattenedBoard flattenBoard() {
	        return board.flatten();
	    }

	    public void update() {
	        // Hier den Spielzustand aktualisieren (z.B. durch Bewegung der GameObjects)
	        board.getObject().nextStep(board.flatten());
	    }

		
	}