package Inter2;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Finterface {

	public static void main(String[] args) {
		
		Function <Integer,Integer> calc = number-> number+5; 
		Function <Integer,Integer> Mult = number-> number*2;   
		
		Consumer<String> strings  = s ->  System.out.println(s+ "!");
		strings.accept("Hallo");
		
		List<String> sudenta  = List.of("peter","fgh","ege \t");
		sudenta.forEach(strings);
		
		Predicate<String> stest = s -> s.startsWith("M");
		System.out.println(stest.test(sudenta.get(1)));

		
		 int result = calc.andThen(Mult).apply(56);
		 System.out.println(calc.apply(4));
		 
		 System.out.println(result);

	}
	static boolean st(String s) {
		return s.startsWith("f");
	}

}
