package inter5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Hashtable;
import java.util.List;
import java.util.PriorityQueue;
import java.util.SortedSet;

public class Hashtabletest {
public static void main(String[] args) {
	
	Hashtable<Integer ,String> h = new Hashtable<>(10);
	SortedSet<Integer> ss = (SortedSet<Integer>) new Hashtabletest();

	
	h.put(23, "dhg");
	h.put(8546, "poco");
	h.put(951, "aldi");
	h.put(023, "loto");
	h.put(444, "");
	
	for (Integer key : h.keySet()) {
		System.out.println(key.hashCode() + "\t"+h.get(key));
		
	}
	System.out.println();

	int size = 1000000;
	List<Integer> a = new ArrayList<Integer>(); 
	long start = System.currentTimeMillis();
	for (int i = 0; i < size; i++) {
		a.add(i);
	}
	long end  = System.currentTimeMillis();
	System.out.println(size + (end- start)  +" ms");
	
//	Deque<Integer> d = new ArrayDeque<>();
//	
//	Object obj = d.add(67);
//	if (obj instanceof Integer ) {
//	
//	}
//	
//	d.add(3);
//	d.add(4);
//	d.add(5);
//	d.add(98);
//	//d.poll();
//	d.peek();
//	for (Integer integer : d ) {
//		System.out.println(integer);
//	}
//	PriorityQueue<String> w  = new PriorityQueue<>();
//	w.add("A");
//	w.add("B");
//	w.add("c");
//	w.add("d");
//	w.toArray();
//	for (String string : w) {
//		System.out.println(string);
//	}
	

 
}
}
