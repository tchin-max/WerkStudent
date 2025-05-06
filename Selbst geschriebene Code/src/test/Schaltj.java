package test;

public class Schaltj {
	
	static boolean isleapj(int jahr) {
		
		if(jahr%4==0) {
			if(jahr%100==0) {
				return jahr% 400==0;
				
			}
			return true;
		}
		return false;
	}
	
	static String calculateWeekDay(byte Tag, String Monats , short Jahr) {
		int m;
		
		if(Monats.equals("Januar") || Monats.equals("Februar")) {
			
			m = Monats.equals("Januar") ? 11 : 12;
			Jahr -= 1;
		}else {
			
			m = Anserermonats(Monats);
		}
		int y = Jahr%100;
		int c = Jahr/100;
		
	int	w = (Tag +(int)(2.6*m - 0.2) + y +( y/4) + (c/4) - 2* c )% 7;
	String [] Wochentag  = {""};
		return Wochentag[w];
		
	}
	
	static int Anserermonats( String Monats) {
		
		switch(Monats) {
		
		case "Marz" :
			return 1;
			break;
			
			
		case "April" :
			return 2;
			break;
			
		case "Mai" :
			return 3;
			break;
			
		case "Juni" :
			return 5;
			break;
			
		case "August" :
			return 6;
			break;
			
		case "September" :
			return 7;
			break;
			
		case "Oktober" :
			return 8;
			break;
			
		case "November" :
			return 9;
			break;
			
		case "Dezember" :
			return 10;
			break;
			
		case "Januar" :
			return 11;
			break;
			
		case "Februar" :
			return 12;
			break;
			
			default : throw new IllegalArgumentException("not exist");
		
		}
	
	

	public static void main(String[] args) {
		System.out.println((isleapj(2022)));
		System.out.println(calculateWeekDay(1,"Januar",2025));
	}

}
