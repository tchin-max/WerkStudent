package InterA;

import java.util.Scanner;

public class Velo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("donner l'heure de debut de la location en entier");
		
		int debut = sc.nextInt();
		
System.out.println("donner l'heure de fin de la location en entier");
		
		int fin = sc.nextInt();
		
		if (debut > fin) {
			System.out.println(" Bizarre, le début de la location est après la fin ... \n");
			return;
		}else if (debut <0 ||fin > 24) {
			System.out.println(" Les heures doivent être comprises entre 0 et 24 ! \n");
			return;
			
		}else if (debut == fin) {
			System.out.println(" Bizarre, vous n’avez pas loué votre vélo bien longtemps ! \n");
			return;
			
		}
		
		int Montant1 =0;
		int Montant2 =0;
		
		if ((debut >=0 && fin <=7) ||( debut>= 17 && fin<=24)) {
			System.out.println("Vous avez loué votre vélo pendant");

			Montant1 =   (  fin - debut);
			System.out.println(Montant1 + "heure(s)"  + " au tarif horaire de 1 franc(s)");

		}
		if ((debut >=7 &&  fin <=17)) {

			Montant2 =   ( fin - debut);
			System.out.println(Montant2 + "heure(s)"  + " au tarif horaire de 2 franc(s)");
			

		}
		
		System.out.println("le montant total a payer est de: " + (Montant1*1 + Montant2*2) + " francs " );
	
		
		
	}
}
