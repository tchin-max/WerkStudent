package Garage;

public class Auto {
	 String Hersteller ;
	 String Farbe;
	 double Kilometerstand = 1000;


String getdescription() {
	return " Das Auto mit : " +"die Marke  " + Hersteller + " die fARbe " + Farbe + " und der Kilometerstanad  "+ Kilometerstand ;
	
}


public String getHersteller() {
	
	
	return Hersteller;
}


public void setHersteller(String hersteller) {
	
	if(hersteller == null || hersteller.equals(" ")) {
		
		 throw new IllegalArgumentException("Der Hersteller darf nicht leer sein");
		
	}
	Hersteller = hersteller;
}


public String getFarbe() {
	return Farbe;
}


public void setFarbe(String farbe) {
	if(farbe != "rot" && farbe != "blau" && farbe != "gelb" ) {
		 throw new IllegalArgumentException("Die Farbe darf nur : rot, blau, gelb sein");
	}
	Farbe = farbe;
}


public double getKilometerstand() {
	return Kilometerstand;
}


public void setKilometerstand(double kilometerstand) {
	
	double g = kilometerstand+=Kilometerstand;
	if(g < Kilometerstand) {
		 throw new IllegalArgumentException("das ist unmoglich");
	}
	if(kilometerstand<0) {
		  throw new IllegalArgumentException();
		}
	Kilometerstand = kilometerstand;
}

}
