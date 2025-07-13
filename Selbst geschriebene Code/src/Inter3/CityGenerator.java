package Inter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CityGenerator {

	public static List<City> Citygetter() {
		return new ArrayList<>( List.of(new City("Johanesburg", "SudAfrika", 15251),
						new City("Berlin", "Germany", 3769000),
						new City("Minich", "Germany", 69000),
						new City("Lyon", "France", 87000),
						new City("madrid", "Spain", 269000),
						new City("Barcelona", "Spain", 692000),

						new City("Kamerun", "Jaounde", 46535),
						new City("Gahna", "Akkra", 65154),
						new City("Djibouti", "Djibouia", 0),
						new City("Frankreich", "Paris", 184523)));
		
	}


}
