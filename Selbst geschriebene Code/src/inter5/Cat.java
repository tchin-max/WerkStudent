package inter5;
@VeryImportant
public class Cat {
	@ImportantString
	private final String name ;
	private int age ;
	@VeryImportant

	public Cat(String name , int age) {
		this.name = name;
		this.age = age;
	}

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@RunImmediatly(times = 2)

private void thisisprivate() {
	System.out.println("private");
}
@RunImmediatly(times = 3)
public static void thisispublicstatic() {
	System.out.println("thisispublicstatic");
}
private static  void thisisprivatestatic() {
	System.out.println("thisisprivatestatic");
}
public void thisispublic() {
	System.out.println("thisispublicohne static");
}
}
