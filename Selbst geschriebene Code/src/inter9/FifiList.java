package inter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FifiList implements FiFO {
private static	class Node{
		Node next;
		Object data;
		public Node(Object data) {
			this.data= data;
		}
		
	}

private Node head = new Node(null);
private Node n = head;
	@Override
	public Object get() {
if (empty()) {
	throw new NoSuchElementException();
}
Object value = head.next.data;
head.next=head.next.next;
if (head.next==null) {
	n= head;
}
return value;
	}

	@Override
	public void put(Object o) {
Node node = new Node(o);
n.next= node;
n = node;

//if (head== null) {
//	head=n;
//}else {
//	Node curr = head;
//	while (curr.next!=null) {
//		curr= curr.next;
//	}
//	curr.next=new Node(o);
//}
	
	}

	@Override
	public boolean empty() {
return head.next==null;
	}


}



	
	

