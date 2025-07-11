package inter8;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Comparatortest implements Comparator<ComparableTest> {

	@Override
	public int compare(ComparableTest o1, ComparableTest o2) {

		return o1.getName().compareTo(o2.getName());
	}
public static void main(String[] args) {
	List<ComparableTest> ct = new ArrayList<>();
	ComparableTest one = new ComparableTest(80, "joj");
	ComparableTest two = new ComparableTest(100, "zaza");
	ComparableTest three = new ComparableTest(60, "nio");
	ComparableTest four = new ComparableTest(50, "ng");
	ct.add(one);
	ct.add(two);
	ct.add(three);
	ct.add(four);
Collections.sort(ct, new Comparatortest().reversed());
	
	for (ComparableTest comparableTest : ct) {
		System.out.println(comparableTest.getName()+"hat: "+comparableTest.getAge());
		
	}

	
}
}
