package inter;

import java.util.*;

public class SeMethode {

	public static void main(String[] a) {
		
		Set <Double> set = new HashSet<Double>();
		

		set.add((double) 3);
		set.add((double) 2);
		set.add((double) 3);
		set.add((double) 1);
		set.add((double) 6);
		set.add((double) 8);
	
	//	set.addAll(Set.of(3.2,3.5,7.9,6.7));

//System.out.println(set.remove(3.2));
//System.out.println(set.isEmpty());
//System.out.println(set.contains(6.0));
 

	//	System.out.println(set);
		
		Set<Weapons> Weapons = new HashSet<>();
		
		Weapons.add(new Weapons("AK-47"));
		Weapons.add(new Weapons("M4"));
		Weapons.add(new Weapons("sniper"));
		Weapons.add(new Weapons("panzer"));
		Weapons.add(new Weapons("rocket"));
		Weapons.add(new Weapons("sniper"));


for(Weapons w: Weapons) {
	System.out.println(w.getName());
}
		
	}
}
