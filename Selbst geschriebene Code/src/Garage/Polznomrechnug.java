package Garage;

public class Polznomrechnug {
	
	 static String  Polynome(int a, int b, int c) {
		return a + "*x^2" + (b >= 0 ? "+" : "-") + Math.abs(b) + "*x" + (c >= 0 ? "+" : "-") + Math.abs(c) + " = 0";
		
	
	}
	 static String calculateforle(int a, int b, int c) {
		 
		 double x1;
		 double x2;
		 
		 if(a ==0 && b==0 && c==0) {
			  return "undendliche losunf moglich";
		 }
		 if(a ==0 && b==0 ){
		
			  return "keine losunf moglich";
			 
		 }else if(a == 0) {
			 
			 x1 = c/b;
			  return " die losun ist : "  + x1;
			 
		 }
		 
		
		 int D = b^2 - 4*a*c;
		 if(D<0) {
			  			  return "unmoglich";
 
 
		 }else if(D>0) {
			 
			 x1 = (-b-Math.sqrt(D))/(2*a);
			 x2 = (-b+Math.sqrt(D))/(2*a);
			  x1 = Math.round(x1 * 100)/100;
			  x2 = Math.round(x2 * 100)/100;


			 
			  

		 
		  return x1 + " und " + x2 + " sind die losung";
		 
		 }
		return null;
		 
	 }
	public static void main(String[] args) {
		System.out.println(calculateforle(0,12,6));
	}

}
