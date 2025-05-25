package Inter2;
@FunctionalInterface

public interface Funktioninter {
	

		 int  berechne(int a, int b) ;
			
		
		
		public static void main(String[] a) {
			
//			Funktioninter e = (a, b) ->{return a*b;
//			
//			}; 
//			System.out.println(e);
			
			Funktioninter addition = (x, y) -> x + y;
			
			System.out.println(addition.berechne(3, 87));
			
		}
	}

