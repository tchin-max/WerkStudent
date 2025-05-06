package test;

public class arraytest {
	
	static void printline(int length) {
		
		for(int i = 0 ;i < length ;i++) {
			System.out.print( "-");
		}
		System.out.println();
	}

		static void printdash(int number) {
			
			for(int i=number ;i>0 ;i--) {
				printline(i);
			}
				for(int i =1;i<=number;i++) {
					printline(i);
					
				}
	
			}

		
		public static void main(String [] args) {
			
			printdash(8);
			
	
	}
		}

	
