package inter5;

import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.util.Scanner;



public class reflection {
	private final  int b =3;
	public final int FINAL = 45;
	public Object e = "df";
	
	
public static void main(String[] args) throws Exception {
//	Scanner sc  = new Scanner(System.in);
//	String imnput  =sc.nextLine();
//	Class<?> cl = Class.forName(imnput);
//	System.out.println(cl);
//	
	
	

	
	Cat cat  = new Cat("ko", 2);
Field[] catFields = 	cat.getClass().getDeclaredFields();
for (Field field : catFields) {
if (field.getName().equals("name")) {
	field.setAccessible(true);
	field.set(cat, "jomo");
}
}
Method[]met = cat.getClass().getDeclaredMethods();
for (Method method : met) {
	if (method.getName().equals("thisisprivate")) {
		method.setAccessible(true);

		method.invoke(cat);
		//System.out.println( method.getName());

	}
	//System.out.println( method.getName());
}
Class<reflection > c = reflection.class;
Method[] mt  = c.getMethods();
for (int i = 0; i < mt.length; i++) {
	System.out.println(mt[i]);
}
Field[] f  = c.getFields();
for (int j = 0; j < f.length; j++) {
	if (f[j].getName().equals("b")) {
		f[j].setAccessible(true);

		f[j].set(c,89);
	}
	System.out.println(f[j]);
}
Class<Double> s  = Double.class;

Method[] method = s.getMethods();
for (int i = 0; i < method.length; i++) {
	System.out.println(method[i]);
}
Field[] fl = s.getFields();
for (int k = 0; k < f.length; k++) {
	System.out.println(fl[k]);
}
}
}
