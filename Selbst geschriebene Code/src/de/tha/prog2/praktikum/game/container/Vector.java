package de.tha.prog2.praktikum.game.container;

import java.util.ArrayList;
import java.util.Iterator;

public class Vector extends AbstractContainer implements Container{
	private java.util.List<Object> arrayList = new ArrayList<>();


	private Object[] oa = new Object[0];
	
	
	@Override
	public boolean add(Object o) {
		
		if (this.contains(o)) {
			throw new AlreadyExistsException("Element schon vorhanden");
			
		}
		Object[] temp = new Object[oa.length+1];
		for(int i=0;i< oa.length;i++) {
			temp[i] = oa[i];
		}
		oa = new Object[oa.length+1];
		oa = temp;
		oa[oa.length-1] = o;
		return true;
	}

	@Override
	public Object get(int i) {
		if (i<0 || i> this.size()) {
			throw new OutOfIndexException("invalid index");
			
		}
		return oa[i];
	}

	@Override
	public int size() {
		

		return oa.length;
	}

	@Override
	public boolean remove(Object o) {
		
		
		
		if (!this.contains(o) ) {
			throw new ElementNotFoundException("Element nicht im Container vorhanden");
			
		}
		Object[] newarray = new Object[oa.length-1];
		int index =0;

boolean remove = false;
		for (int i = 0; i < oa.length; i++) {
			if (!remove && oa[i].equals(o)) {
				remove = true;
				continue;
			}
			newarray[index++] = oa[i];
		}
oa= newarray;
		return true;
	
	}

	@Override
	public void get(Container c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator iterator() {
		Container c = new Vector();
		
		
		Iterator it = c.iterator();
		
	return it;
	}

	


	
}

