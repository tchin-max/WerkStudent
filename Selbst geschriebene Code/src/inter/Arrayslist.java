package inter;

import java.util.*;


public class Arrayslist {
	
	

	public static void main(String[] args) {

		
	
 
	ArrayList<String> Warekorb = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);


	while(true) {
		
		System.out.println("ist die Liste fertig? j/n");
		String s= sc.next();
		
		
		 if(s.equals("n")) {
			
			System.out.println("was brauchst du noch");
		
			String  Produkt =  sc.next();
			Warekorb.add(Produkt);			
		
		} else if(s.equals("j")) {
			System.out.println("hier die eikauf liste:");
			
			for(String Produkt : Warekorb) {
				System.out.println(Produkt);
				
				
			}
			break;
		}
		
	}
	sc.close();

	}
	
	}