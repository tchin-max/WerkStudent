package Garage;

public class Kantine {
	
	public static void main(String[]  args) {
		
		Kaffeautomat a = new Kaffeautomat("KV08","Cappucino",200);
		System.out.println(a.getBeschribung());
		Kaffeautomat b = new Kaffeautomat("89hj");
		System.out.println(b.getBeschribung());
		
	}}	


