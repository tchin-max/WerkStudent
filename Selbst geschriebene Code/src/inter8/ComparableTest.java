package inter8;

record Spieler(String name,int age){


	
}

public class ComparableTest implements Comparable<ComparableTest>  {
private int age;
private String name;
public ComparableTest(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public String getName() {
	return name;
}
@Override
public int compareTo(ComparableTest o) {

	return Integer.compare(age, o.age);
}


}
