package Inter2;

import java.util.*;

public class Wochentags {

	public static void main(String[] args) {
		Random random = new Random();

		Wochentag h = Wochentag.DIENSTAG;
		
		//System.out.println(h);
		
		switch(h) {
		case MONTAG -> System.out.println("lahmer Tag");
		case FREITAG 	-> System.out.println("bester tag");
		
		default -> System.out.println("h.");
		}

	}

}
