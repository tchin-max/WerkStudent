package Inter3;

public class City implements Comparable<City> {
	
	private String name;
	private String country;
	private int population;
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		this.population = population;
	}
@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + "]";
	}

	@Override
	public int compareTo(City o) {

		int Countrcmp = this.country.compareTo(o.country);
		if (Countrcmp!=0) {
			return Countrcmp;
		}
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getPopulation() {
		return population;
	}
	
	

}
