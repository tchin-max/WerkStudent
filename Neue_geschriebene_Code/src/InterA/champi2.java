package InterA;

import java.util.Scanner;

public class champi2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");

		System.out.println("cÃ¨pe de Bordeaux, coprin chevelu ou agaric jaunissant.");
		System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");

		boolean lamelle = sc.nextBoolean();

		if (!lamelle) {

			System.out.print("==> Le champignon auquel vous pensez est ");

			System.out.print("le cÃ¨pe de Bordeaux");
			return;

		} else {

			System.out.print("Est-ce que votre champignon vit en foret (true : oui, false : non) ? ");

			boolean foret = sc.nextBoolean();

			if (!foret) {

				System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");

				boolean chapeau  = sc.nextBoolean();

					if (chapeau) {
	
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("l'agaric jaunissant");
						return;
					} else {
	
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le coprin chevelu");
						
						return;
					}
			}else {
				
				System.out.print("Est-ce que votre champignon a un chapeau convexe(true : oui, false : non) ? ");
				
				boolean chapeau = sc.nextBoolean();
				
				if (!chapeau ) {
					
					System.out.print("==> Le champignon auquel vous pensez est ");

					System.out.print("la girolle");
					
					return;
					
					
				}else {
					
					System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
					
					boolean anneau = sc.nextBoolean();
					
					if (anneau) {
						
						System.out.print("==> Le champignon auquel vous pensez est ");

						System.out.print("amanite tue-mouche");
					}else {
						
						System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("le pied bleu");
						
					}
					
				
					
				}
			}
		}

		

		
		
	}

}
