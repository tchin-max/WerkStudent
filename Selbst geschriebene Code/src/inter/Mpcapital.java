package inter;

import java.util.*;

public class Mpcapital {

	public static void main(String[] args) {
		
		HashMap <String,String> capitals =  new HashMap<>();
		
		capitals.put("Deutschland ", "Berlin");
		capitals.put("Frankreich  ", "Paris");
		capitals.put("Italien", "Rom");
		capitals.put("Spanien", "Madrid");
		capitals.put("Schweiz", "Bern");
		capitals.put("Ostoerreich", "Wien");
		capitals.put("Belgien", "Brussel");
		capitals.put("Niederlande", "Amsterdam");
		capitals.put("Schweden", "Stockolm");
		capitals.put("Portugal", "Lissabon");
		
		ArrayList <String> counties = new ArrayList<String>();
		
		counties.addAll(capitals.keySet());
		Scanner sc  = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			int index = random.nextInt(counties.size());
			String country = counties.get(index);
			
			System.out.println("Was ist die Hauptstdt von: " + country);
			
			if(sc.next().equals(capitals.get(country))) {
				System.out.println("Richtig");
				
			}else {
				System.out.println("falsche Antwort.. Die richtige Anwort ist: " + capitals.get(country) );
break;
			}
			
		}

sc.close();
	}

}
