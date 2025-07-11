package test;

import java.util.ArrayList;
import java.util.List;

class TemperatureList{
	
class Node{
	 Node next;
	 Temperature t;
	 public Node( Temperature t) {
		this.t = t;
	 }
	 
}
	 Node head; 
	public TemperatureList(Node head) {
		this.head = head;
	}
	private void add(Temperature t) {
		TemperatureList tl = new TemperatureList(head);
		Node n =  new  Node(t);
		if (head == null) {
			head=n;
			
		}else {
			Node curr = head;
			while (curr.next!= null) {
				curr = curr.next;
			}
			curr.next = n;
			curr = n;
		}
	}
//	private boolean get(int index) {
//		
//
//			
//		
//
//	}
}



public class Temperature {
	private  byte temp;

	public Temperature(byte temp) {
		if (temp>100) {
			this.temp=100;
			
		}else if (temp<-40) {
			this.temp=-40;
			
		}else {
			this.temp= temp;
		}
			
	}
	private byte increase() {
		
		if (temp<100) {
			temp++;
	}
		return temp;
	}
	private byte decrease(int temp) {
		
		if (temp>-40) {
			temp--;
			
		}
		return (byte) temp;
			}
	


	public String toString() {
		return "Temperature [temp=" + temp + "]";
	}
	
	}
