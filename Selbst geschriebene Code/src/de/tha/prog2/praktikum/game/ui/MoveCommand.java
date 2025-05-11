package de.tha.prog2.praktikum.game.ui;

import de.tha.prog2.praktikum.game.util.XY;

public enum MoveCommand {
		UP,
	    DOWN,
	    LEFT,
	    RIGHT,
	    NONE;
	    
	    public XY OnMove() {
			return switch(this) {
			
			case UP -> new XY(0, -1);
            case DOWN -> new XY(0, 1);
            case LEFT -> new XY(-1, 0);
            case RIGHT -> new XY(1, 0);
            case NONE -> new XY(0, 0);
			};
			
		}

		
}
