package InterA;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class wodchang extends FilterWriter{
private StringBuilder sb = new StringBuilder();

	protected wodchang(Writer out) {
		super(out);

	}
	protected wodchang(Writer out,Replace r) {
		super(out);

	}
	enum Replace{FIRST,SECOND}
	
@Override
public void write(int c) throws IOException {
if (Character.isWhitespace(c)) {
	flush();
out.write(c);
}else {
	sb.append(c);

}
}
@Override
public void write(char[] cbuf, int off, int len) throws IOException {
	super.write(cbuf, off, len);
	for (int i = off; i < len+off; i++) {
write(cbuf[i]);
	}
}
}
