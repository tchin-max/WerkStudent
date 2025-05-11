package de.tha.prog2.praktikum.game.core;

import de.tha.prog2.praktikum.game.container.Vector;


import de.tha.prog2.praktikum.game.gameobjects.GameObject;

public class GameObjectSet {

    private final Vector objects;
    
    

    public GameObjectSet() {
        this.objects = new Vector();
    }

    public void addObject(GameObject object) {
       objects.add(object);
    }

    public boolean removeObject(GameObject object) {
        return objects.remove(object);
    }

    public GameObject get(int index) {
        return (GameObject) objects.get(index);
    }

    public int size() {
        return objects.size();
    }

    public void nextStep(GameObjectContext goc) {
        for (int i = 0; i < objects.size(); i++) {
            GameObject go = (GameObject) objects.get(i);
            if (go != null) {
                go.nextStep(goc);
            }
        }
    }
public boolean containsObject(GameObject go) {
	
	for (int i = 0; i < this.size(); i++) {
		if(this.get(i).equals(go)) {

			return true;
		}
}
	return false;
}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GameObjectSet:\n");
        for (int i = 0; i < objects.size(); i++) {
        	GameObject go =  (GameObject) objects.get(i);
sb.append(go.toString()).append(" (").append(go.getPoints()).append(")").append("\n");      
}
        return sb.toString();
    }
}
