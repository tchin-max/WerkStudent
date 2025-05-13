package inter5;

import java.util.Vector;

public class VectorTest {
	public class test{
		String s ="Aus test KLsse";
		public void Ausgabe() {
			System.out.println(s);
			
		}
	}
public static void main(String[] args) {
	VectorTest tests = new VectorTest();
	
	Vector v  =new  Vector(10);
System.out.println(	v.size());
System.out.println(v.capacity());

v.addElement(tests);
v.addElement(5);
System.out.println(	v.size());
System.out.println(v.capacity());




}
}
