package inter4;

public class RomanNumbers {
    public static int convertToInt(char[] roman) {
        int totalWert = 0; 
        int previousValue = 0; 

       
        for (int i = roman.length - 1; i >= 0; i--) {
            int currentValue = getRomanValue(roman[i]); // Hole den Wert des aktuellen Symbols

        
            if (currentValue < previousValue) {
            	totalWert -= currentValue;
            } else {
            
            	totalWert+= currentValue;
            }

            //  für die nächste Iteration
            previousValue = currentValue;
        }

        return totalWert; 
    }

    //  Wert eines römischen Symbols zu erhalten
    private static int getRomanValue(char symbol) {
        switch (symbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; 
        }
    }
    
    public static String intToRoman(int number) {
    	

        String[] romanNumerals = {
        		"M", "CM", "D", "CD", "C", 
                "XC", "L", "XL", "X", 
                "IX", "V", "IV", "I"
        };
        
        int[] values = {
        		  1000, 900, 500, 400, 100, 
                  90, 50, 40, 10, 
                  9, 5, 4, 1
        };
        
        String result = ""; 

       
        for (int i = 0; i < values.length; i++) {
       
            while (number >= values[i]) {
                result += romanNumerals[i]; 
                number -= values[i];
            }
        }

        return result; 
    
    	
    }
}
	