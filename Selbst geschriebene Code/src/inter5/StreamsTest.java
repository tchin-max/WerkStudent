package inter5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTest {
	private enum Gender{
		MALE,FEMALE
	}
	static class Personn{
		
		private final String name;
		private final int age;
		private final Gender gender;
		public Personn(String name, int age, Gender gender) {
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
	
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public Gender getGender() {
			return gender;
		}
	
		@Override
		public String toString() {
			return "Personn [name=" + name + ", age=" + age + ", Gender=" + gender + "]";
		}

		
	}
	
	public static void main(String[] args) {
		List<Personn> p = name();
		List<Personn> females = new ArrayList<StreamsTest.Personn>();
		for (Personn personn : p) {
			if (personn.getGender().equals(Gender.FEMALE)) {
				females.add(personn);
				
			}
		}
//females.forEach(System.out::println );
List<Personn> soeted = 
p.stream()
.sorted(Comparator.comparing( Personn::getAge)
		.reversed()
		.thenComparing(Personn::getGender))
		.collect(Collectors.toList());
//soeted.forEach(System.out::println );

		p.stream()
		.filter(t -> t.getGender().equals(Gender.FEMALE) )//after filtering we must take our element to a list 
		.collect(Collectors.toList());
		//females.forEach(System.out::println );
		
		//p.forEach(System.out::println );
	boolean matching =	p.stream().allMatch(t -> t.getAge()>12);
	System.out.println();
	
	//System.out.println(matching);
boolean anymatch =	p.stream().anyMatch(t -> t.getAge()>12);
//System.out.println(anymatch);

boolean nonmatch =	p.stream().noneMatch(t -> t.getName().equals("Zimmermann"));
//System.out.println(nonmatch);

p.stream()
.min(Comparator.comparing(Personn::getAge))
.ifPresent(t -> System.out.println(t) );
 
Map<Gender, List<Personn>> groupByGender =
p.stream().collect(Collectors.groupingBy(Personn::getGender));
groupByGender.forEach((t, u) -> {System.out.println(t); u.forEach(g -> System.out.println(g)  );  });

Optional<String> oldestFemal=
p.stream()
.filter(t ->t.getGender().equals(Gender.FEMALE))
.max(Comparator.comparing(Personn::getAge))
.map(Personn::getName);
oldestFemal.ifPresent(System.out::println );;
	}
	private static List<Personn> name() {
		return List.of(new Personn("joe", 12, Gender.MALE),
						new Personn("oliver", 56, Gender.MALE),
						new Personn("lukas", 19, Gender.MALE),
						new Personn("sofia", 22, Gender.FEMALE),
						new Personn("Zimmermann", 90, Gender.FEMALE));
		
	}


}
