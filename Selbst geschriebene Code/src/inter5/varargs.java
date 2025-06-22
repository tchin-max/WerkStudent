package inter5;

import java.util.Map;
 record agence(int s,String name) {
	 static int it ;
 agence {
	
}
	public static String ss;
	 public  String toUpperCase() {
		 return name.toUpperCase();
		
	}
	 public static void toloweCase() {
		System.out.println("toLowerCase");
	}
	 
	
 }
public class varargs {
  
	
	public static final double pi = 3.14; 

	public static void isStaticMethode() {
		System.out.println("im Static bro");
	}
public static void PrintThings(int...go) {
	
	for (int i : go) {
		if (i%2==0) {
	System.out.println("das ist Gerade: " + i);
		}
		if (!(i%2==0)) {
			System.out.println("das ist nicht Gerade " + i );

			
		}

	}
	
	
}
public static void main(String[] args) {
	agence.toloweCase();
	
	agence a = new agence(5,"saint john");
	System.out.println(a.toUpperCase());
	varargs v = new varargs();
	v.isStaticMethode();

	System.out.println("pi ist : " + varargs.pi);
	
	 varargs.isStaticMethode();
	System.out.println();
PrintThings(12,5,6,2);
}
}
