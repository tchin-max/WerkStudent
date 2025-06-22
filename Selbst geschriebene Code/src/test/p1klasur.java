package test;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class p1klasur {
	private static void printStarts(int n) {
		
		for (int i = n; i >0; i--) {
			
printit(i);
			}
		for (int i = 1; i <n; i++) {
			printit(i);
		}
	}
	
	private static void printit(int d) {
for (int i = 0; i < d; i++) {
	System.out.print("-");
	
}		
System.out.println();

	}
	private void convertUpperCase(char[] array) {
for (int i = 0; i < array.length; i++) {
	char c = array[i];
	
	if (c>='a' && c<='z') { 
		array[i]= (char) (c+32);
		
	}
}
		 
	}
	private static void printArray(char[] array) {
		/**
		 *array 
		 *
		 */
		if (array == null || array.length<0)return ;
			
		
		int i=0;
 
		do {
		System.out.println(	array[i]);
		i++;
		} while (i<array.length);
	}
	public static long countPositive(long[] arr, int index, long counter) {
		
if (index>arr.length) {
	return counter;
}
counter+=arr[index];
//			if (arr[index]>0 ) {
//counter++;			
//			
//		}
		return countPositive(arr, index+1, counter);	
	}
	
	private static int findLast(int array[],int value) {

for (int i = array.length-1; i >=0; i--) {
	if (array[i]==value) {
		return i;
	}
}
return -1;

		
		
	}
	
	private static  void getNextRandomNumber() {
Scanner sc = new Scanner(System.in);
Random r = new Random();
long a = r.nextInt(90)*1;
long b = r.nextInt(90)*1;
long ergebnis = a+b; 
while (true) {
	int i=0;

System.out.println("was viel ist: " + a +"+"+b);
int input = sc.nextInt();
if (input== ergebnis) {
	System.out.println("gute ergebnis");
}
	System.out.println("falsch... eine Antwort könnte:" + ergebnis);


	}

}
	private static  void printSquare(int row, int colums,int space) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colums; j++) {
				System.out.print("*" );

	for (int j2 = 0; j2 < space; j2++) {
		System.out.print(" ");
	
	
}
			}
			System.out.println();
		}
		
	}
	private static void printNumbers(int n) {
	do {
		n--;
		if (n<0) {
			break;
		}
		System.out.println(n);

	}
	while (n>=0);


//	for (int i = n; i >0; i--) {
//		System.out.println(i);
//
//		if (n==0) {
//			break;
//		}
//	}

	}
	private static boolean isLeapYear(int jahr) {
		
		if (jahr%400==0) {
			return true;
		
		}else
		if (jahr%100==0) {
			return false;
		}
		if ( jahr%4==0) {
			return true;
		}else {
			return false;
	
		}
	}
	private static boolean isLeapYearExpression(int jahr) {
		
	return	 jahr%400==0 ?true: jahr%100==0?false:jahr%4==0?true:false;

	}
	private static boolean isInArray(int num, int array[],int index) {
		
			if (index>=array.length) {
				return false;
			}
			if (array[index]==num) {
				return true;
			}

		
		return isInArray(num, array,index+1);
	
	}
	private static int [] everySecondElement(int array[]) {
		  
		  int result[] = new int [array.length] ;
		  int j=0;
for (int i = 0; i < array.length; i+=2) {
	result[j]= array[i];
	j++;
}
return result;
		
	}
	private  byte temp ;

	
	public static void main(String[] args) {
		int arr [] = {1,56,65,56};
		int value = 1;
		//System.out.println(findLast(arr,value));
		//getNextRandomNumber();
	//System.out.println(	countPositive(arr, 0, 0));
	//	printStarts(8);
		//System.out.println("gibt dein vorname");
		//printSquare(5, 6, 3); 
		//printNumbers(20);
		//System.out.println(isLeapYearExpression(1900));
		//System.out.println( isInArray(value, arr,0));
		int rec[] = everySecondElement(arr) ;
		for (int j : rec) {
			System.out.println(j);

		}
		}
	
}
