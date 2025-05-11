package de.tha.prog2.praktikum.game.core;

import de.tha.prog2.praktikum.game.level.LevelGenerator;
import de.tha.prog2.praktikum.game.util.XY;

public class Board {

    private final GameObjectSet gos;
    private final XY size;

    public Board(LevelGenerator generator) {
        this.size = generator.getSize();
        this.gos = generator.generate();
    }

    public GameObjectSet getObject() {
        return gos;
    }

    public FlattenedBoard flatten() {
        return new FlattenedBoard(size, gos);
        
    }

    public XY getSize() {
        return size;
        
    }
    
    
}

