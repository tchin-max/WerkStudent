package inter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RecordTest {
	enum Gender {
MALE,FEMALE		
		
	}
	
record People (String name , int Age, Gender gender) {}

public static void main(String[] args) {
	List<People> p = Arrays.asList(new People("Ali",9,Gender.FEMALE),
									new People("Jordan", 45,Gender.MALE),
									new People("Soul", 22,Gender.MALE),
									new People("kopo", 50, Gender.FEMALE)
			
			);
	//p.stream().filter(t -> t.Age() >8).unordered().collect(Collectors.toList());
	Optional<String> theOldest =
	p.stream().filter(t ->t.Age()==50 )
	.max(Comparator.comparing(People::gender) )
	.map(People::name );
	
	theOldest.ifPresent(t ->System.out.println(t) );
	
	p.forEach(System.out::println);
	System.out.println();
	
	Map<Gender, List<People>> PeopleGroup = p.stream()
			.collect(Collectors.groupingBy(People::gender));
	
	PeopleGroup.forEach((t, u) ->{System.out.println(t); System.out.println(u);} );
	
	
}

}
