package Inter3;

import Inter3.Outer.Inner;

public class Outer {

	public  void weapon() {
		String s = "M4";
		System.out.println(s);
		
		class lokal{
			String s = "Lambo";
			
			public void Cars() {
				System.out.println(s);
			}
		}
		lokal l = new lokal();
		l.Cars();
	}
 
	public   class Inner{
		static void sagehallo() {
			System.out.println("hallo there!!");
			
		}
	}
	

public static void main(String[] args) {
	Outer outer  = new Outer();
	outer.weapon();
	Outer.Inner inner = outer.new Inner();
inner.sagehallo();
}
}
