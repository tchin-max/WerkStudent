package inter8;

import java.awt.Point;

public class BUildertest {
private final String course;
private final String degree;
private final int price;

public BUildertest( Builser b) {
this.course = b.course;
this.degree = b.degree;
this.price = b.price;
}

@Override
public String toString() {
	return "UniSearch [course=" + course + ", degree=" + degree + ", price=" + price + "]";
}

public static class Builser{
	private final String course;
	private  String degree = "Bachelor";
	private  int price = 0;
	public Builser(String course) {
		this.course = course;

	}
	

	public Builser Degree(String dergree) {
		this.degree= dergree;
		return this;
	}
	public Builser Price(int price) {
		this.price= price;
		return this;
		
	}

	public BUildertest build() {
		return new BUildertest(this);
	}
	
}
public static void main(String[] args) {
	BUildertest us = new  BUildertest.Builser("bachelor").Price(1000).build();
	System.out.println(us);
	
}
}