package Inter3;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;
public class Iterators {

	public static void main(String[] args) {
ArrayList<String> s = new ArrayList<>();
s.add("jo");
s.add("aad");
s.add("br");
s.add("lo");

Iterator<String> it = s.iterator();
Random random = new Random();
while (it.hasNext()) {
	System.out.println(it.next());
}
	}

}
