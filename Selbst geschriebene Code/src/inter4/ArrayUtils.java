package inter4;

public class ArrayUtils {

	public static int sumArray(int [] array ) {
		int summe=0;
		for(int i=0; i<array.length;i++) {
			
			summe +=array[i];
		}
		return summe;
	}
	
	public static byte[] toDigitArray(long number) {
		
		number = Math.abs(number);
		
		int lange = (int) (Math.log10(number)+1)  ;
		
		byte[] newarray = new byte[lange]  ;
		
		for(int i= lange -1; i>=0;i--) {
			
			newarray[i] = (byte) (number%10); // Extrahiere die letzte Ziffer und speichere sie
			  number /= 10; // Entferne die letzte Ziffer der Zahl
			
		}
		return newarray;
	}
	
	public static void reverseArray(int[] array) {
		
		for(int i=0; i<array.length/2;i++) {
		
		int T=array[i];
		array[i]= array[array.length-i-1];
		array[array.length-i-1]=T;
		}	
	}
	
	 public static int[] removeDuplicates(int[] array) {
	      
	        int uniquenummer = 0;
	        
	        // Erstelle ein neues Array mit der maximalen Größe
	        int[] Array = new int[array.length];

	      
	        for (int i = 0; i < array.length; i++) {
	            boolean isDuplicate = false;

	           
	            for (int j = 0; j < uniquenummer; j++) {
	                if (array[i] == Array[j]) {
	                    isDuplicate = true; 
	                    break; 
	                }
	            }

	            
	            if (!isDuplicate) {
	                Array[uniquenummer] = array[i];
	                uniquenummer++; 
	
	            }
	        }

	        // Erstelle das endgültige Ergebnisarray mit der richtigen Größe
	        int[] result = new int[uniquenummer];
	        
	        // Fülle das Ergebnisarray mit den einzigartigen Werten
	        for (int i = 0; i < uniquenummer; i++) {
	            result[i] = Array[i];
	        }
	        
	        

	        return result; 
	    }
	}