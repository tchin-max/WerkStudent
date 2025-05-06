package Inter3;

public class Annonymous_classes {
	
	class  Animal{
		
		String s  = "wouf wouf ";
		public void dog() {
			System.out.println(s);
		}
	}
	
public static void main(String[] args) {
//	Annonymous_classes ac = new Annonymous_classes();
//	Annonymous_classes.Animal a = ac.new Animal();
//	a.dog();
//	Annonymous_classes.Animal ad = ac.new Animal() {
//		
//		public void dog() {
//System.out.println("ouaouoauoaouaou");
//		}
//	};
//	ad.dog();
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
System.out.println("ÿouuuuuuuu");			
		}
	};
	r.run();
}
}
