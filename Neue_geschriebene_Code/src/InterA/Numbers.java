package InterA;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entier: ");
		int number = sc.nextInt();
		
		
		if (number==0) {
			System.out.println("Le nombre est 0 et (il est pair)");
			return;

		};
			if (number == Math.abs(number) && number %2==0) {
				System.out.println("Le nombre est positif et pair");

			
			}else
			
			
				if (number == (Math.abs(number)) && number %2!=0) {
					System.out.println("Le nombre est positif et impair");

				}else
				
			
				if (number != (Math.abs(number)) && number %2==0) {
					System.out.println("Le nombre est negatif et pair");

				}else
				
			
				if (number != (Math.abs(number)) && number %2!=0) {
					System.out.println("Le nombre est negatif et impair");
				}

		
		
		
	
	}
	
}
