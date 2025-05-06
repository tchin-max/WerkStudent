package Garage;
import java.util.Scanner;

public class Passwortpruf {
	
	static void passprufung(String Pass) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" Geben Sie den Pass ein :");
		
		String Passprufungs = sc.next();
		int i= 1;
		while(Pass.equals(Passprufungs)== false && i<3 ) {
			
			System.out.println(" Falscher Pass . versuch nochmal");
			
			Passprufungs = sc.next();

	i++;	
		}
		if(Pass.equals(Passprufungs)== true) {
			
			System.out.println(" gut!!!!!!!!");

			
		}else {
throw new IllegalArgumentException("Falscher Eingabe");			

		}
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Geben Sie einen Pass ein :");
		String Pass = sc.next();
	passprufung(Pass);

		sc.close();
	}
	
}
