package InterA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Student implements StudentInfo {
	
public Student() {
}
	@Override
	public String firstNames() {

		return "Souleyman";
	}

	@Override
	public String lastName() {

		return "Tchinda";
	}

	@Override
	public int matriculationNumber() {

		return 22;
	}
public static void main(String[] args) throws IOException {
	StudentInfo si = new Student();
	BufferedWriter os = new BufferedWriter (new FileWriter("Teilnehmers.txt"));
	os.write(si.firstNames() + "\n");
	os.write(si.lastName() + "\n");
	os.write(String.valueOf(si.matriculationNumber()));
	
	os.close();
	BufferedReader br = new BufferedReader(new FileReader("Teilnehmers.txt"));
	String s ;
	while ((s=br.readLine())!=null) {
		System.out.println(s);

	}
	br.close();

}
}
