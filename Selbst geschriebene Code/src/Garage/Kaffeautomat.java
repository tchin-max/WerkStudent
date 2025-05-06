package Garage;

public class Kaffeautomat {
	private String Bezeichnung;
	private String Kaffesorte;
	private int fuelstand;
	
	Kaffeautomat(String Bezeichnung,String Kaffesorte,int fuelstand){
		setBezeichnung(Bezeichnung);
		setKaffesorte(Kaffesorte);
		setFuelstand(fuelstand);
	}
	
	Kaffeautomat(String Bezeichnung){
		
		this(Bezeichnung,"Cappucino",10);
		
	}
	String getBeschribung() {
		
		return "Ein Kaffeautomat mit" + Bezeichnung + "fur" + Kaffesorte + "mit dem fuelstang" + fuelstand +"%"  ;
		
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		if(bezeichnung == null || bezeichnung.equals(" ")) {
			 throw new IllegalArgumentException("darf nicht sein");
		}
		Bezeichnung = bezeichnung;
	}

	public String getKaffesorte() {
		return Kaffesorte;
	}

	public void setKaffesorte(String kaffesorte) {
		if(kaffesorte != "Cappucino" && kaffesorte != "Espresso" && kaffesorte != "Kaffee") {
			 throw new IllegalArgumentException("nicht gultig");
		}
		Kaffesorte = kaffesorte;
	}

	public int getFuelstand() {
		return fuelstand;
	}

	public void setFuelstand(int fuelstand) {
		if(fuelstand<0 && fuelstand>100) {
			 throw new IllegalArgumentException("nicht in der Grenze");
			
		}
		fuelstand = fuelstand;
	}

}
