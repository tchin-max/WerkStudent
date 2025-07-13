package inter9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.sun.tools.javac.Main;

public class QuestionFactory {
	public static Answerable CreateQuestion(String className , Object...args)   {
try {
	Class<?> cl = Class.forName(className);
	if (className.endsWith("FreeTextQuestion")) {
		Constructor<?> c1 = cl.getConstructor(String.class,String.class);
		Object o1 = c1.newInstance(args[0],args[1]);
		return (Answerable) o1;
	}else if (className.endsWith("MultipleChoiceQuestion")) {
		Constructor<?> c2 = cl.getConstructor(String.class,String.class,int.class);
		Object o2 = c2.newInstance(args[0],args[1],args[2]);
		return (Answerable) o2;
	}
	
} catch (Exception e) {  
	
}
return null;
		
		
	}
public static void main(String[] args) {
	Queue<Answerable> a = new QueueList<>();
a.push_front(QuestionFactory.CreateQuestion(   "inter9.FreeTextQuestion", "Was ist die Haupstadt von Deutschland","Berlin"));
String[]s= {"26","45","85","36"};
a.push_front(QuestionFactory.CreateQuestion( "inter9.MultipleChoiceQuestion", "Was ist 20+6",s,2));
	QuizRunner qr = new QuizRunner(a);
	qr.run();
}
}
