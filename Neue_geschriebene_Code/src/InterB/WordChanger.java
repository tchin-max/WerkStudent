 package InterB;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;



public class WordChanger extends FilterWriter {
	
	public WordChanger(Writer out)  {
		super(out);

	}
	public WordChanger(Writer out,Replace r)  {
		super(out);

	}

	enum Replace {FIRST,SECOND}

	@Override
	public void write(int c) throws IOException {
		if (Character.isWhitespace(c)) {
			super.write(c);
		}else {
			
		}
	
	}
	
	@Override
	public void write(char []cbuf,int off,int len) throws IOException {
	for (int i = off; i < off+len; i++) {
		write(cbuf[i]);
	}
	 
	}

}
