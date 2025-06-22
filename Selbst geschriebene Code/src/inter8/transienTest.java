package inter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class transienTest implements Serializable {

	String Name ;
transient	String Passwort;
	public  transienTest(String name, String passwort) {
		Name = name;
		Passwort = passwort;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		teransmeth();
	}
	protected static  void teransmeth() throws IOException, FileNotFoundException, ClassNotFoundException {
		transienTest user = new transienTest("Alice", "Geheim123");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.ser"));
	oos.writeObject(user);
	
	oos.close();
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser.ser"));
transienTest t = (transienTest) ois.readObject();
	ois.close();
	System.out.print(t.Name +" ");
	System.err.println(t.Passwort+"\n");
	}
}
