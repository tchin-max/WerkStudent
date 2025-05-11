package de.tha.prog2.praktikum.game.container;

import java.util.*;
public abstract class AbstractContainer implements Container{
	 @Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass() ) {
			return false;
		}
		
		AbstractContainer ab =  (AbstractContainer) o;
		
		 Object[] abArray = ab.toArray();
		 Object[] thisArray = this.toArray();
		return Arrays.equals(abArray, thisArray);
		 
	}
	 @Override
	public  String toString() {
		
		 StringBuilder sb = new StringBuilder("Container content:\n");
		Object[] inhalt = toArray();
		
		for(int i =0 ;i<inhalt.length; i++) {
			sb.append(i).append(":< ").append(inhalt[i]).append(">\n");
		}
		return sb.toString();
	}
	
	
	@Override
	public abstract boolean add(Object o);
	
	@Override
	public abstract int size();
	@Override
	public abstract boolean remove(Object o);


}


