package inter;

public class Recursion {
	 static void helloword(int counter) {
		 if(counter ==0) {
			 System.out.println("break");
		 }else {
			 System.out.println("hey..");
			 helloword(counter-1) ;
		 }
		
	 }
	 
	 static long fakulteat(long number) {
		 
		 
		 if(number==1) {
			 return 1;
		 }else if(number==0) {
			
			 throw new IllegalArgumentException("gibt eine andere Zahl");
		 }
				return number*fakulteat(number-1);

		 }
		
	 


	public static void main(String[] args) {
		//System.out.println(fakulteat(0));
		helloword(10) ;
		System.out.println(fakulteat(40));
		
	}

}
