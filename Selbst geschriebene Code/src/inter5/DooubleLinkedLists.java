package inter5;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import de.tha.prog2.praktikum.game.container.DoubleLinkedList;

class Node{
int data;
Node next;
Node prev;

public Node(int data) {
this.data = data;
	
}
}

public class DooubleLinkedLists {
	
	 static Node head;
	
	public DooubleLinkedLists(Node head) {
		this.head = head;

	}
	public void AddAfter(int data) {
		Node n = new Node(data);
		if (head==null) {
			head=n;
		}
		Node curr= head;
		while (curr.next != null) {
			curr = curr.next;
			
		}
		curr.next = n;
		n.prev = curr;
		curr = n;
		
		
	}
	
	void AddInFront(int data) {
		Node n = new Node ((int) (data*Math.random()*5));

		if (head==null) {
			head = n;
		}else {
			head.prev= n;
			n.next = head;
			head = n;
		}
		
	}
	public Node DeleInFront() {
		Node delete = head;
		if (head==null|| head.next==null) {
			head = null ;
			return delete;
			
		}else {
			head = head.next;
			
			head.prev = null;
			
		}
		return delete;
		
	}
	public void DeleteAfter (Node curr, Node after,int data) {
		
		if (curr== null) {
			return;
			
		}
		if (curr == after ) {
			Node n = new Node(data);
			
			curr.next.prev = n;
			n.next = curr.next;
			curr.next = n;
			n.prev = curr;
			
		}else {
			
			DeleteAfter(curr.next, after, data);
			
		}
		
	}


	
	public static void main(String[] args) {
		head = new Node(3);
		Node after = new Node(7);
		head.next = after;
		after.prev = head.next; 
		//head= after;
		
		

	}
	
	
//	public static void main(String[] args) {
//		DoubleLinkedList dll = new   DoubleLinkedList();
//		
//		LinkedList<String> ll = new LinkedList<String>();
//		
//		ll.offer("a");
//		ll.offer("b");
//		ll.offer("c");
//		ll.push("e");
//		ll.push("f");
//		ll.push("g");
//		ll.poll();
//		ll.pop();
//		//ll.pop();
//		ll.peekFirst();
//		
//		for (String lls : ll) {
//			System.out.print( " "+ lls);
//
//			
//		}

		


	
}
