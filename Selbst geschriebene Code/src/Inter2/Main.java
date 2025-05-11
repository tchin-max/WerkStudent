package Inter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;
import javax.swing.JOptionPane;

public class Main {
	
	public static void writeinFile() throws FileNotFoundException{
		
		String path = JOptionPane.showInputDialog(null,"Bite gib den Pfad");
		File file = new File(path);
	
		System.out.println(		file.getName());
		System.out.println(file.isFile());
		
		if(!file.exists()) {
			throw new FileNotFoundException("Datei existiert hier nicht");
			
		}
		
		
			try {
				FileWriter fileWriter = new FileWriter(file,true);
				fileWriter.write("Hey  also geklappt 2.\n");
				fileWriter.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}catch(Exception e) {
				
			}
			
			
	}

	public static void main(String[] args) {
		
String path = "\"C:\\Users\\tchin\\Documents\\Aufgabe_8_Abgabe[1].pdf\"";


try {
	Main.writeinFile();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
