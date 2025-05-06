package test;
import java.io.*;
public class inzerface {

	
	public  static void main (String [] args) throws IOException {
		int j = 0;
		int	i =  20;
		
	try	
	{
	
	 j = 18/i;
	 if(j==0) 
			throw new IllegalArgumentException("noooooooo");

	 
	}
catch(ArithmeticException e) {
	
	System.out.println("passt nicht");
	System.in.read();
			}
	
	System.out.println(j);
	

		
	}
}
