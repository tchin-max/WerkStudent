package inter5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Gender {
	Male , Female
}
 record people (String name , int age,Gender gender) {
	
 }
public class amigoCode {
	public static void main(String[] args) {
		
		List<people>ac=  getpeople();
		
		boolean b = ac.stream().anyMatch(t ->t.age() <=18);
		//System.out.println(b);
		List<String> i=
	ac.stream().filter(tg ->tg.age()<18 ).limit(3).map(people::name ).collect(Collectors.toList());
		i.forEach(System.out::println);
//ac.stream().min(Comparator.comparing(people::age)).ifPresent(d ->System.out.println(d) );;

		
		
		//for (int i = 0 , size= array.length; i < size; i++) {
		
		
		List<Integer> jk = List.of(1,2,3,55,7,98,0);
		for (int j = 0; j < jk.size(); j++) {
			System.out.println(jk.get(j));
		}
		
		

		}
	public static java.util.List<people> getpeople() {
return new ArrayList<>( List.of(new people("jojo", 12, Gender.Male),
				new people("Sandra", 32, Gender.Female),
				new people("Obonjajar", 9, Gender.Male),
				new people("ALina", 23, Gender.Female)));
	}
}
