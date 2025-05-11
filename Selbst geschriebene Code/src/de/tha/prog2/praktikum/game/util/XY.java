package de.tha.prog2.praktikum.game.util;
import de.tha.prog2.praktikum.game.container.*;

public final class XY {
	private final int x;
	private final int y;
	
	public XY(int x ,int y) {
		
		this.x =  x;
		this.y = y;
		
	}
    public int getX() { return x; }
    public int getY() { return y; }
    
   


    
    @Override
	public String toString() {
		return " [x=" + x + ", y=" + y + "]";
	}
	public XY move(XY direction) {
    	
		return new XY(this.x + direction.getX(),this.y+direction.getY());
    	
    }

}