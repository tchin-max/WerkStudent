package inter9;

public class QueueList<T> implements Queue<T> {
	

private static  class Node<T>{
	Node<T> next;
	T data;
	public Node(T data) {
		this.data= data;
	}
	
	
}
public Node<T> head = new Node<>(null);
public Node<T> n = head;

	@Override
	public void push_front(T element) {
		
Node<T> node = new Node<>(element);
n.next=node;
n= node;
		
	}

	@Override
	public T pop_back() {
if (empty()) {
	throw new EmptyQueueException("Queue ist Empty");
}
Node<T> first = head.next;
T value =  first.data;


head.next=first.next;
if (head.next==null) {
	n=head;
}

		return value;
	}

	@Override
	public boolean empty() {
return head.next==null;
	}



	
}
