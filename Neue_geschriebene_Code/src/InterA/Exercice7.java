package InterA;

import java.util.Scanner;

public class Exercice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a reel number: ");

		float x = sc.nextFloat();

		System.out.println(x == 1.5f ? "x n'apprtient pas a I"
				: x >= -10 && x <= 3 ? "x appartient a I"
						: x >= -1 && x <= 0 ? "x n'appartient a I" :
							x > 3 ? "x n'apprtient pas a I" : "");
	

	}
}
