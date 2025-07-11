package inter9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Testmo {
	public static void main(String[] args)  {
//		Class<?> cl = Class.forName("Testmo");
//		Constructor<?> c = cl.getConstructor();
//		Object o = c.newInstance();
		Class<Testmo> tmo = Testmo.class;
		Constructor[] constructor = tmo.getConstructors();
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i]);
		}
		
	}

}
