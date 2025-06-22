package test;

import java.util.Iterator;


public class blatt {
	private static boolean arrayContains(int [] a, int [] b) {

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i]==a[j]) {
					return true;
					
				}
			}
		}
		return false;
		
	}
	private int biggestValue(int b[][],int v) {
int big = Integer.MIN_VALUE;
for (int i = 0; i < b.length; i++) {
	for (int j = 0; j < b[i].length; j++) {
		if (b[i][j] > big) {
			big=b[i][j];
			
		}
	}

}
return big;
		

	}
	private char[] toLowerCase(char[] c) {
		char []newchar = new char[c.length];

		for (int i = 0; i < c.length; i++) {
			newchar[i]=  Character.toLowerCase(c[i]);
		}

		return newchar;
		

	}
	private boolean isPalindrom(char[] p) {
for (int i = 0; i < p.length; i++) {
int anfand=0 ;
	int Ende = (char) (p.length-1);
	int wortanfand = Character.toLowerCase(p[anfand]);
	char wortende = Character.toLowerCase(p[wortanfand]);
	while(anfand<Ende) {
		if (wortanfand!=wortende) {
			return false;
			
		}
		wortanfand++;
		wortende--;
		
		
	}
	

}
return true;


		
	}
	
	private static void printRectangle(int width , int heigth) {
	
		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private boolean isPalindrom(String text) {
		
			
		return isPalindrom(text.toCharArray());
		
		
	}
	private static void printMessage(String text, int breite) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print("*" );
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println();

		}

	}
	private static void printchristmaustree(int heigth) {

		for (int i = 0; i < heigth; i++) {
			for (int j = 0; j < heigth-i-1; j++) {
				System.out.print(" ");
				

			}
			for (int j2 = 0; j2 < 2*i+1 ; j2++) {
				System.out.print("*");
				
				
			}
			System.out.println();
		
		}
		for (int j = 0; j < heigth-1; j++) {
			System.out.print(" ");
		}
		System.out.println("#");
	}
	private static boolean parenthesis(String text) {
	int top =-1;
	char []pile= new char[text.length()];
	for (int i = 0; i < text.length(); i++) {
		char pos = text.charAt(i); 

		if (pos=='{' ||pos=='[' ||pos=='(') {
			pile[++top]= pos;
		}else if (pos=='}' ||pos==']' ||pos==')') {
			if (top==-1) {
				return false;
			}
		
		char zumachen = pile[top--];
		if (!(matches(zumachen, pos))) {
			return false;
		}	
		}
	}
	return top==-1;

	}
	public static boolean matches(char open,char close) {
		return open=='('&&close==')' ||open=='{'&&close=='}' || open=='['&&close==']';
	}
	public static void main(String[] args) {
		int a[]= {5,1,5,9,5,4,6,5};
		int b[]= {65,25,32};
//printMessage("Hallo", 1);
		//printRectangle(4, 5);
		//System.out.println(arrayContains(a, b));
		//printchristmaustree(10);
	System.out.println(	parenthesis("((sdf}}"));
	}
}
