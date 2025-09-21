package InterA;

public class Adress extends AdresseBase {
private String streetName;
private int number ;



	public Adress(String streetName, int number, String zipCode, String city) throws InvalidZipCodeException {
	super(zipCode, city);
	this.streetName = streetName;
	this.number = number;
}



	public Adress(String streetName, int number, int zipCode, String city) throws InvalidZipCodeException {
		super(zipCode, city);
		this.streetName = streetName;
		this.number = number;
	}



	@Override
	public String toString() {
		return  streetName  + " "+  number+ "\n" + getZipCode() +" " + getCity() ;
	}



	
}
