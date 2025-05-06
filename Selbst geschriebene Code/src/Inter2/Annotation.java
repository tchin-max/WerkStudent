package Inter2;

public class Annotation {
@SuppressWarnings("unused")
	final double PI = 3.1415;
	
	public static void main(String[] args) {
 
		HundAnno h = new HundAnno("bell", 12);
		Katze k = new Katze();
		if(k.getClass().isAnnotationPresent(Important.class)) {
			System.out.println("is wichtig");
		
		}else {
			System.out.println("nicht wichtig");
		}
	}

}
