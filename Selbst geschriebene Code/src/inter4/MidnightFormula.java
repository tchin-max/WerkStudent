package inter4;

public class MidnightFormula {

	public static  String printFormula( int a ,int b, int c ) {
	
		return a + "*x^2" + (b>=0 ? " + " : " - ") +  Math.abs(b) +  ("*x ") + (c>=0 ? "+ " : "- ") + Math.abs(c)+(" = 0");
		
	
	}	
		
	public static String calculateFormula(int a, int b, int c) {
		float x1;
		float x2;
		
		if (a == 0 && b == 0 && c == 0) {
			return "Es gibt unendlich viele Lösungen";
		}
		if (a == 0 && b == 0) {
			return "Es gibt keine Lösung der Gleichung";
		} else if (a == 0) {
			x1 = (float) -c / (float) b;
			return "Die Gleichung hat eine reelle Lösung: x1 = " + x1;
		}
			
		if (((b * b) - 4 * a * c) < 0) {
			return "Die Gleichung hat keine reelle Lösung";
		} else if (((b * b) - 4 * a * c) == 0) {
			x1 = (float) -b  / (2 * a);
			x1 = Math.round(x1 * 100f) / 100f;
			return "Die Gleichung hat eine reelle Lösung: x1 = " + x1;
		} else {
			x1 = (float) (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			x1 = Math.round(x1 * 100f) / 100f;
			x2 = (float) (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
			x2 = Math.round(x2 * 100f) / 100f;
			return "Die Gleichung hat zwei reelle Lösungen: x1 = " + x1 + " x2 = " + x2;
		}
	}
	}
	
	
