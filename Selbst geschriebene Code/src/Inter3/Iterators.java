package Inter3;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
ArrayList<String> s = new ArrayList<>();
s.add("jo");
s.add("aad");
s.add("br");
s.add("lo");

Iterator<String> it = s.iterator();

while (it.hasNext()) {
	System.out.println(it.next());
}
	}

}
