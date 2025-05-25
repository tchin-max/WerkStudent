package inter5;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotationtest {
	
	@SuppressWarnings("unsued")
	
public static void main(String[] args) throws Exception {
	Cat cat = new Cat("Benji", 5);
	reflection r  = new reflection();
	
	System.out.println(r.getClass().isAnnotationPresent(VeryImportant.class));
	
System.out.println(	cat.getClass().isAnnotationPresent(VeryImportant.class));

Method[] met = cat.getClass().getDeclaredMethods();
for (Method method : met) {
	method.setAccessible(true);
	if(method.isAnnotationPresent(RunImmediatly.class)){
		RunImmediatly a = method.getAnnotation(RunImmediatly.class);
		for (int i = 0; i < a.times(); i++) {
			method.invoke(cat);
   
		}
	}
	
}
Field[] f = cat.getClass().getDeclaredFields();
for (Field field : f) {
	field.setAccessible(true);
	if (field.isAnnotationPresent(ImportantString.class)) {
		Object obj =  field.get(cat);
		//obj.toString();
		if (obj instanceof String objString) {
		System.out.println(	objString.toUpperCase());
		}
	} 
}

}
}
