package inter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import Inter2.statics;

public class PropatiesTest {
public static final String Prop_Name= "jk.name";
	
	public static void main(String[] args) throws IOException {
//		
//		Properties sysprop = System.getProperties();
//	sysprop.list(System.out);
//	System.out.println("====================================");
//
//		System.out.println("java.class: " + sysprop.getProperty(Prop_Name));
//		
//		System.out.println("====================================");
		
		Properties p = new Properties();
p.setProperty("User", "Soul");
p.setProperty("IpV4", "192.0.0.5");
FileOutputStream os = new FileOutputStream("props.propaties");
p.store(os, "Konfigure");
os.close();
FileInputStream is = new FileInputStream("props.propaties");
InputStream isp = ClassLoader.getSystemResourceAsStream(" ");
p.load(is);
is.close();
		System.out.println(p.getProperty("User"));
		System.err.println(p.getProperty("IpV4"));
		
//		Class<Properties> pr = Properties.class;
//		Method[]met = pr.getMethods();
//		for (int i = 0; i < met.length; i++) {
//			
//			System.out.println(met[i]);
//		}
	}
}
