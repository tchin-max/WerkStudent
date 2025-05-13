package inter5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Printer<T extends Cat > {
	T thingprint;
	
public Printer(T thingprint) {
	this.thingprint = thingprint;
}

private static<T,V> void name(T druck,V past) {
	System.out.println(druck);
	System.out.println(past);
}
private static void listthing(List<? extends Cat > a) {
	System.out.println();
	
}
 
public void print() {
	thingprint.thisispublicstatic();
	System.out.println(thingprint);
}
public static void main(String[] args) {
	
	List<Cat> i = new ArrayList<>();
	i.add(new Cat("",0));
	
	listthing(i);
	//Printer<Integer> p  = new Printer<>(12);
	
	//p.print();
	//Printer<?>obj = new Printer<Object>("oi");
	//obj.print();
	Printer<Cat> cat = new Printer<>(new Cat("john",6));
	cat.print();
	ArrayList<Cat> c  = new ArrayList<Cat>();
c.add(new Cat("fg", 10));
Cat cs = c.get(0);

System.out.println(c.get(0));

name(new Cat("fr", 0) , "yo");
}
}
