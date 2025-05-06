package Inter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Katze {
	public static void main(String[] args) {
File datei = new File("test.txt");

try {
	FileWriter writer  = new FileWriter(datei);
	writer.write("hey..");
} catch (IOException e) {
System.out.println("wurde nicht gefunden ");	
e.printStackTrace();
}

}
	}