package inter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaInputOutput {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("br.json"));
		
		bw.write("bref");
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("br.json"));
		String text;
		while ((text= br.readLine())!=null) {
			System.out.println(text);

		}
		br.close();
	}

}
