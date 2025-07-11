package inter9;

import java.util.Objects;

public class AdressBAse {
	private String city;
	private String zipCode;
	
	public AdressBAse(int zipCode,String city) {
String zip =String.format("%5d", zipCode);
if (zip.length()>5) {
	throw new InvalidZipCodeException("not valid zip");
}
		this.city = city;
		this.zipCode= zip;
	}
	

	public AdressBAse(String city, String zipCode) {
		
		if (!zipCode.matches("\\d{5}")) {
			throw new InvalidZipCodeException("not valid zip");

		}
		this.city = city;

		this.zipCode = zipCode;
	}

	
	public String getCity() {
		return city;
	}
	public int getZipCode() {
		return Integer.parseInt(zipCode);
	}


	private String getZipCodeString() {
return zipCode;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdressBAse other = (AdressBAse) obj;
		return Objects.equals(city, other.city) && Objects.equals(zipCode, other.zipCode);
	}

	
	



	
	

}
