package inter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class JavaInputOutput {
	public static void main(String[] args) throws IOException {
		Reader reader;
		Class<? extends JavaInputOutput> writer = new JavaInputOutput().getClass();
	System.out.println(	writer.isHidden());
		BufferedWriter bw = new BufferedWriter(new FileWriter("br.xml"));
		//BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		bw.write("bref");
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("br.xml"));
		String text;
		while ((text= br.readLine())!=null) {
			System.out.println(text);

		}
		br.close();
	}

}
