package InterA;

import java.util.Scanner;

public class Champi {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Pensez à un champignon : amanite tue mouches, pied bleu, girolle,\r\n"
				+ " cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.println();

		System.out.println(" Est-ce que votre champignon a des lamelles (true : oui, false : non) ?");
		String input = sc.next();

//		while (!(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false"))) {
//		}
//			System.out.println("Svp entrer 'true' ou 'false' ");
//
//			 input = sc.next();

		if (input.equals("true")) {
			System.out.println(" Est-ce que votre champignon a un anneau (true : oui, false : non) ?");
			String input2 = sc.next();

			if (input2.equals("false")) {
				System.out.println("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ?");
				String input3 = sc.next();

				if (input3.equals("false")) {
					System.out.println("Le champignon auquel vous pensez est la girolle");
					return;
				}
			}

		} else if (input.equals("false")) {
			System.out.println(" Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
			String input4 = sc.next();
			if (input4.equals("true")) {
				System.out.println("Est-ce que votre champignon possede des tubes ?");
				String input5 = sc.next();

				if (input5.equals("true")) {
					System.out.println("Le champignon auquel vous pensez est le cèpe de Bordeaux.");
					return;
				} else {
					System.out.println("Un champignon de la sorte n'existe pas!!!");
					return;
				}

			} else if (input4.equals("false")) {
				System.out.println("Les chanpignons  poussent dans les prés ?");
				String input5 = sc.next();
				if (input5.equals("true")) {
					System.out.println("Les chanpignons  ont t'ils  un chapeau convexe et un anneau ?");
					String input6 = sc.next();

					if (input6.equals("true")) {

						System.out.println(
								"Les champignons auquels vous pensez sont:  l’agaric jaunissant, , l’amanite tue-mouches et le\r\n"
										+ " coprin chevelu.");
						return;
					} else if (input6.equals("false")) {
						System.out.println("Les chanpignons  ont t'ils  un chapeau convexe ?");
						String input7 = sc.next();
						if (input7.equals("true")) {
							System.out.println(
									"Les champignons auquels vous pensez sont :  sont l’agaric jaunissant, l’amanite tue-mouches\r\n"
											+ " et le pied bleu..");
							return;
						} else if (input7.equals("false")) {
							System.out.println("Les chanpignons  ont t'ils  un anneau ?");
							String input8 = sc.next();
							if (input8.equals("true")) {
								System.out.println(
										"Les champignons auquels vous pensez sont: sont l’agaric jaunissant, l’amanite tue-mouches et le\r\n"
												+ " coprin chevelu..");
								return;
							}

						}

					}
					{

					}
				}
			}

		}

	}
}
