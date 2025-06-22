package inter8;


public class synchronied {
static int count;
private static  synchronized void increment() {
	
	try {
		count++;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public static void main(String[] args) {
	increment();
}
}
