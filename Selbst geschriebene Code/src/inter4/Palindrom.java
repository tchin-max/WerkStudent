package inter4;

public class Palindrom {
	
	public static char [] toLowerCase(char [] charArray) {
		char [] charArr = new char [charArray.length]; 
		for(int i =0; i<charArray.length;i++) {
		
			 charArr[i] = Character.toLowerCase(charArray[i]);
			 	
	}	
return charArr;
}
		
	public static boolean isPalindrom( char [] charArray ) {
		
		int Wortstart = 0;
		int Wortende = charArray.length-1;
		
	char	startchar = Character.toLowerCase(charArray[Wortstart]);
	char	endchar = Character.toLowerCase(charArray[Wortende]);
	
		while(Wortstart < Wortende) {
			
			if(startchar!= endchar) {
				
				return false;
			}
			Wortstart++;
			Wortende--;
		
		}
		return true;
	}
	
	
		
	
	
public static boolean isPalindrom( String text ) {
	
	char [] charArray = text.toCharArray();
	return isPalindrom(charArray);
	
}	
}

