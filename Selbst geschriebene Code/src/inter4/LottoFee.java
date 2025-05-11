package inter4;
import java.util.*;
public class LottoFee {
	private boolean [] gezogenenum;
	private int numgezogen;
	private Random random;
public LottoFee() {
	this.gezogenenum = new boolean[50];
	this.numgezogen = 0;
	this.random = new Random();
	
	
}	

public  byte nextNumber() {

	if(numgezogen<6) {
		int Zahl;
		do {
			Zahl = random.nextInt(49)+  1 ;
		}while(gezogenenum[Zahl]);
		gezogenenum[Zahl]= true;
		numgezogen++;
		return (byte) Zahl;
	}else if (numgezogen==6) {
		
		numgezogen++;
		return (byte) random.nextInt(10);
	}else {
		return -1;
	}
	

	
	
	
	
	
	

}}
