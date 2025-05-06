package Inter3;

public class nebentest {
public static void main(String[] args) {
	int Array[] = {2,4,7,9,90};
	inverArra(Array);
	
	for (int j = 0; j < Array.length; j++) {
		System.out.print(Array[j] + " ");

	}
	

	
}
	static void inverArra(int Array[]) {
		
		for (int i = 0; i < Array.length/2; i++) {
			
			int temp = Array[i];
			Array[i] = Array[Array.length-i-1];
			Array[Array.length-i-1] = temp;
			
		}
	
}
 
}