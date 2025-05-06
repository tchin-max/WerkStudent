package test;

import java.util.Arrays;

public class Soutnunm {

	int small;
	 int moyen; 
	int big;
	
Soutnunm(int a, int b, int c){
		
		int [] tab = {a,b,c};
		Arrays.sort(tab);
		
		small = tab[0];
		moyen = tab[1];
		big = tab[2];
		
	}
	
	public int getSmall() {
		return small;
	}



	public int getMoyen() {
		return moyen;
	}



	public int getBig() {
		return big;
	}


	
}
