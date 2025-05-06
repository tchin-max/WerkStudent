package Garage;

public class Werkstatt {
	
	public static void main (String [] args) {
		
		
		Auto a = new Auto();
		
		a.setHersteller(" BMW");
		a.Kilometerstand = 1;
		  a.setFarbe("rot");;
		
		System.out.println(a.getdescription());
		
	}

}
