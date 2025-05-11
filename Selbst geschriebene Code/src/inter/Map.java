package inter;

import java.util.*;

public class Map {

	public static void main(String []a) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(5,"Orangen");
		map.put(7,"kiwi");
		map.put(2,"mango");
		map.put(8,"Apfel");
		map.put(4,"Birne");
		map.put(5, "Orangen");

	//System.out.println(map.get(5));
	
	Set<Integer> m = map.keySet();
	
	map.remove(5);
	System.out.println(map.containsKey(4));
	map.replace(8, "Avocado");
	
	for(Integer s: m) {
		System.out.println(  s +" "+  map.get(s) );
		
	}
	
	}
}
