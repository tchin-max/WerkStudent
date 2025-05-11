package de.tha.prog2.praktikum.game.core;

import de.tha.prog2.praktikum.game.gameobjects.GameObject;
import de.tha.prog2.praktikum.game.util.XY;

public class FlattenedBoard implements BoardView,GameObjectContext {
	
	private final XY size;
	private final GameObject[][] board;
	
	public FlattenedBoard(XY size , GameObjectSet gameObjects) {
		
		this.size = size;
		this.board = new GameObject[size.getX()][size.getY()];
		for (int i = 0; i < gameObjects.size(); i++) {
					GameObject go = gameObjects.get(i);
							XY pos = go.getLocation();
if (pos != null && pos.getX()< size.getX() && pos.getY()< size.getY()) {
	board[pos.getX()][pos.getY()] = go;
	
}
			
		}
	 
	}

	 @Override
	    public XY getSize() {
	        return size;
	    }

	    @Override
	    public GameObject getGameObject(int x, int y) {
	    	if (x>= 0 && x< size.getX() && y>= 0 && y< size.getY()) {
	    		
	    		return board[x][y];
				
			}
	      return null;//falsche koordinaten Eingabe
	    }
	    @Override
	    public boolean move(GameObject gameObject, XY direction) {
	        
	    	int oldX = gameObject.getLocation().getX();
	    	int oldY = gameObject.getLocation().getY();
	    	
	    	int newX = oldX + direction.getX();
	    	int newY = oldY + direction.getY();
	    	
	    	if (newX >= 0 && newX < size.getX() && newY >= 0 && newY< size.getY()) {
	    		if(board[newX][newY] == null) {
	    		board[oldX][oldY] = null;
	    		board[newX][newY] = gameObject;
	    		gameObject.setLocation(new XY(newX,newY));//neue Position der Spielfiguren
				return true;
			}
	    		}
			return false;
	       
	}
	    }