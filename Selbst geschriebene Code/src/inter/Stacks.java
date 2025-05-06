package inter;

import java.util.*;
import  inter.SeMethode;


import javax.sound.midi.SysexMessage;

public class Stacks {

	public static void main(String[] a) {
		
		Stack <String> Spiel = new Stack<>();
		
		Spiel.push(" a");
		Spiel.push(" b");
		Spiel.push(" c");
		Spiel.push(" d");
		
		
	
	Iterator<String> it = Spiel.iterator();
	while(it.hasNext()) {
		
		Random random = new Random();
				
		System.out.println(it.next());
		
		if(it.next() == "a") {
			
			throw new IllegalArgumentException("Getroffen");
			
		}
		
	}
	
		System.out.println(Spiel);
		

		/*Queue <String> numb = new LinkedList <>();
		
		numb.add("abi");
		numb.add("soul");
		numb.add("rock");
		numb.add("rnb");
numb.poll(); 


		System.out.println(numb.element());
for(String s: numb) {
	System.out.println(s);
}
*/
	}
	
	
}
