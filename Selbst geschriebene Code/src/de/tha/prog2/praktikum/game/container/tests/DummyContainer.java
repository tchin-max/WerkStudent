package de.tha.prog2.praktikum.game.container.tests;

import de.tha.prog2.praktikum.game.container.Container;
import de.tha.prog2.praktikum.game.container.DoubleLinkedList;
import de.tha.prog2.praktikum.game.container.OutOfIndexException;
import de.tha.prog2.praktikum.game.container.Vector;

import java.util.ArrayList;
import java.util.Iterator;



public class DummyContainer implements Container {
	private java.util.List<Object> arrayList = new ArrayList<>();
	

	
	
	@Override
	public boolean add(Object o) {
		return arrayList.add(o);
	}

	@Override
	public Object get(int i) {
		if (i<0 || i> this.size()) {
			throw new OutOfIndexException("invalid index");
			
		}
		
		return arrayList.get(i);
	}

	@Override
	public int size() {
		return arrayList.size();
	}

	@Override
	public boolean remove(Object o) {
		return arrayList.remove(o);
	}


	@Override
	public void get(Container c) {
		return ;
	}
		

	
	public static void main(String[] args) {
		DummyContainer dc = new DummyContainer();
		String ds = new String("test");
		dc.add(ds);
		dc.isEmpty();
		dc.contains(ds);
		dc.toArray();
		dc.clear();
		dc.isEmpty();
		
	}

	@Override
	public Iterator iterator() {
		Container c = new DoubleLinkedList();
		
		Iterator<Object> it = c.iterator();
		
		return it;
		
	}
}
