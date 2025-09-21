package test;

public class RoundUpCalculator {
	public static Calculator getCalculator() {
		
		return new Calculator() {
			
			@Override
			public double multiply(double a, double b) {
double c = Math.ceil( a*b);
				return c;
			}
			
			@Override
			public double log10(double value) {
double result =  Math.log10(value);
				return Math.ceil(result);
			}
		};
		
	}

}
