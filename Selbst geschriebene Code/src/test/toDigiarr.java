package test;

public class toDigiarr {
	
	static byte[]  toDida( long number) {
	
		number = Math.abs(number);
		
		byte a = (byte) (Math.log10(number) + 1);
		
	byte	neuarray [] = new byte[a] ;
		for(int i = a-1;a>=0;a--) {
			
			neuarray[i]= (byte) (number%10);
			number/=10;
		}
		
		
		return neuarray;
		
		
	}
}