package test;

import java.util.function.Function;

import Inter3.Lambda;

public final  class Funktiontest {
	int value;
	

 public Funktiontest(int value) {
	 this.value = value;
	 
	 
	 
}
 
 public Double exec(Function<Integer, Double> lambda) {
	 return lambda.apply(value);
	
}
 public static void main(String[] args) {
	Funktiontest executor = new  Funktiontest(12);
			System.out.println( executor.exec(x-> 1+ Math.sqrt(x)));
}
	 
}
	
	


