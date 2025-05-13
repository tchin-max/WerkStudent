package inter5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Hashtabletest {
public static void main(String[] args) {
	Hashtable<Integer,String> h = new Hashtable<>(10);
	h.put(23, "dhg");
	h.put(8546, "poco");
	h.put(951, "aldi");
	h.put(023, "loto");
	
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
	System.out.println(size + (end+ start));
}
}
