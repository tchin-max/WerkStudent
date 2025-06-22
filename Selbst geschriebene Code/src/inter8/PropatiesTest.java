package inter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropatiesTest {

	
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
p.setProperty("User", "Soul");
p.setProperty("IpV4", "192.0.0.5");
FileOutputStream os = new FileOutputStream("props.propaties");
p.store(os, "Konfigure");
os.close();
FileInputStream is = new FileInputStream("props.propaties");
p.load(is);
is.close();
		System.out.println(p.getProperty("User"));
		System.out.println(p.getProperty("IpV4"));
	}
}
