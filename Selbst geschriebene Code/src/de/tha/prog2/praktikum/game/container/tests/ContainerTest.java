package de.tha.prog2.praktikum.game.container.tests;


import java.util.ArrayList;
import java.util.Iterator;

import de.tha.prog2.praktikum.game.container.AbstractContainer;


import de.tha.prog2.praktikum.game.container.Container;
import de.tha.prog2.praktikum.game.container.DoubleLinkedList;
import de.tha.prog2.praktikum.game.container.Vector;




public class ContainerTest implements Container {
	private java.util.List<Object> arrayList = new ArrayList<>();

	
	
	public static void Containttesting(Container c) {
		c.add("sniper");
		c.add("bombe");
		c.add("panzer");
		c.add("M4");
		
		

		
		System.out.println("die groesse ist:"  + c.size());
		System.out.println("das erste Element ist:"  + c.get(1));
		System.out.println("ist der Panzer vorhanden:"  + c.contains("panzer"));

		System.out.println("remove done? " + c.remove("sniper"));
		
		System.out.println( "ist es leer? " + c.isEmpty());
		
		System.out.println(		c.toString().getClass());
		
		Object[] a= c.toArray();
		a[0] = c.get(0);
		a[1] = c.get(1);
		a[2] = c.get(2);
		
		for(Object arr : a) {
		System.out.println("im aray gibt es :" + arr);
		}
		System.out.println("Sind die Container gleich?" + c.equals(c));	
	}

@Override
public boolean add(Object o) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Object get(int i) {
	// TODO Auto-generated method stub
	return i;
}
@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public boolean remove(Object o) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void clear() {
	// TODO Auto-generated method stub
	
}
@Override
public boolean contains(Object o) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public Object[] toArray() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void get(Container c) {
	// TODO Auto-generated method stub
	
}

public static void main(String[] args) {
	Container dc = new DummyContainer();
	Containttesting(dc);
	Vector v = new Vector(); 
	//Containttesting(v);
	DoubleLinkedList dll = new DoubleLinkedList();
	//Containttesting(dll);
	
	Container c = new Vector();
	Iterator iter = c.iterator();
	
	while (iter.hasNext()) {
		Object o = (Object) iter.next();
		
	}
	
	
}

@Override
public Iterator iterator() {
	Iterator<Object> it = arrayList.iterator();
	
	
	return it;
	 
	
	
}
}



