package inter5;

public class varargs {
	
public static void PrintThings(int...go) {
	
	for (int i : go) {
		if (i%2==0) {
	System.out.println("das ist Gerade: " + i);
		}
		if (!(i%2==0)) {
			System.out.println("das ist nicht Gerade " + i );

			
		}

	}
	
	
}
public static void main(String[] args) {
	
PrintThings(12,5,6,2);
}
}
