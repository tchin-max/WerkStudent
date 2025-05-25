package inter5;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.Vector;

import inter.Map;

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
	
	Class<Map> m = Map.class;

	Method[] met = m.getMethods();
	for (int i = 0; i < met.length; i++) {
		System.out.println(met[i]);
		
	}
	
	



}
}
