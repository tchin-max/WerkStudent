package inter4;

public class DateHandler {

    public static boolean isLeapYear(int Jahre) {
        if (Jahre % 4 == 0) {
        	if (Jahre % 100==0 ) {
        		return Jahre % 400==0;
        	}
        	return true;
        }
        return false;
    }

    public static String calculateWeekDay(byte Tag, String Monats, short Jahre) {
        int m;
        if (Monats.equals("Januar") || Monats.equals("Februar")) {
            m = Monats.equals("Januar") ? 11 : 12;
            Jahre -= 1;
        } else {
        	 m = AndereMonatsNumber(Monats);
        }

        int y = Jahre % 100;
        int c = Jahre / 100;

        int w = (Tag + (int)(2.6 * m - 0.2) + y + (y / 4) + (c / 4) - 2 * c) % 7;
        w = (w + 7) % 7; 

        String[] Wochentag = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        return Wochentag[w];
    }
    
    private static int AndereMonatsNumber(String Monate) {
    	 
        switch (Monate) {
            case "März": return 1;
            case "April": return 2;
            case "Mai": return 3;
            case "Juni": return 4;
            case "Juli": return 5;
            case "August": return 6;
            case "September": return 7;
            case "Oktober": return 8;
            case "November": return 9;
            case "Dezember": return 10;
            default: throw new IllegalArgumentException("Ungültiger Monat");
        }
    }
}