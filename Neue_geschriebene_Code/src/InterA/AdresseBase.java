package InterA;

import java.util.Objects;

public class AdresseBase {
	private String city;
	private String zipCode;
	public AdresseBase(int zipCode, String city) throws InvalidZipCodeException {
		
		String zip =  String.format("%5d", zipCode);
		if ( zip.length()>5) {
			throw new InvalidZipCodeException("nicht Valid");
		}
		this.zipCode= zip;
		this.city = city;

	}
	public AdresseBase(String zipCode, String city) throws InvalidZipCodeException {

		if (!zipCode.matches("\\d{5}")) {
			throw new InvalidZipCodeException("nicht Valid");

	}
		this.zipCode= zipCode;
		this.city = city;
	}
	
	public int getZipCodeString() { 
		return Integer.parseInt(zipCode);
	}
	public String getZipCode() {
		return zipCode;
	}
	
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "AdresseBase [city=" + city + ", zipCode=" + zipCode + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdresseBase other = (AdresseBase) obj;
		return Objects.equals(city, other.city) && Objects.equals(zipCode, other.zipCode);
	}
	

}
