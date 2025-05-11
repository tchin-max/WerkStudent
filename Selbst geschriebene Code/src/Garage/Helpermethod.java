package Garage;
import java.util.*;

public class Helpermethod {
	
	static String convertToLeetSpeek(String string) {
		
		string = string.toUpperCase();
		StringBuilder builder = new StringBuilder();
		for(int i =0 ;i<string.length();i++) {
			 char ch = string.charAt(i);


			
			switch(ch) {
			case 'A':
				builder.append("4");
				break;
				
			case 'B':
				builder.append("|3");
				break;
			case 'C':
				builder.append("[");
				break;
			case 'D':
				builder.append("1)");
				break;
			case 'E':
				builder.append("3");
				break;
			case 'F':
				builder.append("|=");
				break;
			case 'G':
				builder.append("9");
				break;
			case 'H':
				builder.append(")-(");
				break;
			case 'I':
				builder.append("|");
				break;
			case 'J':
				builder.append("_|");
				break;
			case 'K':
				builder.append("|<");
				break;
			case 'L':
				builder.append("|_");
				break;
			case 'M':
				builder.append("!4!");
				break;
			case 'N':
				builder.append("|\\|");
				break;
				
			case 'O':
				builder.append("()");
				break;
			case 'P':
				builder.append("|0");
				break;
			case 'Q':
				builder.append("0_");
				break;
			case 'R':
				builder.append("|2");
				break;
			case 'S':
				builder.append("$");
				break;
			case 'T':
				builder.append("+");
				break;
			case 'U':
				builder.append("v");
				break;
			case 'V':
				builder.append("\\/");
				break;
				
			case 'W':
				builder.append("\\/ \\/");
				break;
			case 'X':
				builder.append("><");
				break;
			case 'Y':
				builder.append("0/");
				break;
			case 'Z':
				builder.append("2");
				break;
			default : builder.append(ch) ; 
				
			}
			
		}
		return builder.toString();
	}


	static int[] getFlattenedArray(int D2 [][]) {
		int totalelemnt =0 ;
		for(int [] row: D2) {

			totalelemnt+=row.length;
		}
		int index = 0;
		int[] D1 = new int [totalelemnt] ;
		for(int row []: D2 ) {
			for(int value : row) {
				
				D1[index++] = value;
			
			}
			
		}
		return D1;
	}
	
	static int [] getDigitPositions(String string) {
		
		int numbelement = 0;
		
		for(int i =0;i<string.length();i++) {
			
			
			if(Character.isDigit(string.charAt(i))) {
				numbelement++;
				
			}		
			}

		
		int index = 0;
		
		int result []= new int [numbelement];
for(int i =0;i<string.length();i++) {
			
			
			if(Character.isDigit(string.charAt(i))) {
				if(string == " ") {
					throw new IllegalArgumentException("not support");
				}
				
				result[index] = i;
				index++;
	}
	
	
}
return result;}
	
//	static int getAverageCSVGrade(String string []) {
//		
//		int element =0;
//		
//		for(int i =0;i<string.length;i++) {
//			element+= string[i].length();
//		}
//		 
//		return ;
//		
//		
//	}
//	

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

System.out.print("geben deas Wort, das sie umwandeln wollen");

String text = sc.next();

System.out.print("Umwandung des Worts:" + convertToLeetSpeek(text) );


sc.close();

int array[][]= {{1,2,3,4},{5,6,7},{8}} ;
int result [] = getFlattenedArray(array);
for(int row : result) {
	System.out.print( row + " " + "\n");
	
	
}
System.out.println(Arrays.toString(getDigitPositions("23.05.2019")));
System.out.println(Arrays.toString(getDigitPositions(" ")));


	}
	

	

		
}

