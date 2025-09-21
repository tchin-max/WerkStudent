package InterB;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TextWriter {
public final Reader r;
	public TextWriter(Reader r) {
this.r = r;
	}
	
	public void writeTo(String Dateiname) throws CouldNotWriteException {
		  try (Writer writer = new FileWriter(Dateiname);
		             FilterWriter changer = new WordChanger(writer, WordChanger.Replace.SECOND)) {

		            char[] buffer = new char[1024];
		            int len;
		            while ((len = r.read(buffer)) != -1) {
		                changer.write(buffer, 0, len);
		            }
		            changer.flush();
		        } catch (IOException e) {
		            throw new CouldNotWriteException("Fehler beim Schreiben");
		        }
		    }
	
		
	}

