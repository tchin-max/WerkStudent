package InterA;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a reel number: ");

		float x = sc.nextFloat();
		
		float FirstExpression = (float) (x / (1-Math.exp(x))) ;
		
		float SecondExpression =  (float) (x * Math.log(x) * Math.exp(2/(x-1))) ;
		
		float ThirdExpression = (float) ((-x-Math.sqrt((Math.pow(x, 2)) - 8*x))/(2-x)) ;
		
		float FourthExpression = (float) Math.sqrt((Math.sin(x)-(x/20)) * Math.log(Math.sqrt(Math.pow(x, 2) - (1/x)))) ;


		
	
		
		System.out.println("Expression 1 : " + FirstExpression);
		System.out.println("Expression 2 : " + SecondExpression);
		System.out.println("Expression 3 : " + ThirdExpression);
		System.out.println("Expression 4 : " + FourthExpression);

	

	}
}
