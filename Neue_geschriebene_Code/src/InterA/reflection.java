package InterA;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection {
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
	
		Class<Student> st = Student.class;
		
		Method[] mt = st.getClass().getDeclaredMethods();
			
		for (Method method : mt) {
			if (method.getClass().equals("firstNames")) {
				method.invoke(mt);
			}
			System.out.println(method);
		}
	}

}
