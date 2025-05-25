package Inter2;
import java.security.PublicKey;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
public class Finterface {

	public static void main(String[] args) {
		
//		Function <Integer,Integer> calc = number-> number+5; 
//		Function <Integer,Integer> Mult = number-> number*2;   
//		
//		Consumer<String> strings  = s ->  System.out.println(s+ "!");
//		strings.accept("Hallo");
//		
//		List<String> sudenta  = List.of("peter","fgh","ege \t");
//		sudenta.forEach(strings);
//		
//		Predicate<String> stest = s -> s.startsWith("M");
//		System.out.println(stest.test(sudenta.get(1)));
//
//		
//		 int result = calc.andThen(Mult).apply(56);//erstmal calc
//		 int results = calc.compose(Mult).apply(9);//erstmal Mult und dann clac
//		 System.out.println(calc.apply(4));
//		 
//		 System.out.println(result);
		
		List<Integer> interger = Arrays.asList(1,34,56,3,245,90,-3);
		int counter =  (int) interger
				.stream()
				.filter(x -> (x>1) && x==2  &&( x >2 )&& (x%2)!=0 )
			
				.count();
		
		
		System.out.println(counter);
		
		  Stream<Integer> s =  interger.stream();
		  
		  Stream<Integer> s2 = s.filter(x-> x%2 == 0);
		  
		  long count = s2.count();
		  //s2.sorted();
		  
		//  System.out.println(" " + count + " ");
		 
		interger.forEach(i-> System.out.println(" " + i));
		Iterator<Integer> interator = interger.iterator();
		while (interator.hasNext()) {
			Integer integer = (Integer) interator.next();
			
			
			//System.out.println(integer);
			
		}
		List<String> lists = Arrays.asList("Peter","joe","Laury","koliomoto");

		
//		 Predicate<String> student = st -> st.startsWith("v");
//		 System.out.println( student.test(lists.get(1)));
//
//	}
//	
//	public boolean name(String st) {
//		return st.startsWith("kSS");
//		
//	}

Supplier<Double> rand = () -> Math.random()*100;
System.out.println(rand.get());
	}

}
