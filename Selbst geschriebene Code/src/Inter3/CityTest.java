package Inter3;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Inter3.*;
public class CityTest {
	public static void main(String[] args) {
		List<City>cg = CityGenerator.Citygetter();
		
		Collections.sort(cg);
		cg.forEach(System.out::println);
System.out.println("=================================");
		cg.sort(Comparator.comparing(City::getPopulation).reversed());
		cg.forEach(System.out::println);

	}
	

}
