package Inter2;

public class Generics {

	static<G> void Array(G[] Arrays) {
		
		for(G t: Arrays) {
			
			System.out.println(t);
		}
	}
	public static void main(String[] a) {
		
		Integer Arraysint [] = {2,4,7};
		String ArraysString [] = {" yo ","js " ,"fj", "fdh "};
		Character Arrayschar [] = {'f','g','p'};
		Double Arraysdouble [] = {2.0,4.9,7.9};
		
		Array(Arraysint);
	}
}
