package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class testVor {
	private void makenoie() {
System.out.println("Making noises from main Class");
	}
	class inner extends testVor {
		private void noises() {
			
			super.makenoie();
System.out.println("making Noises from inner");
		}
		class moreinner {
			
			private void Methodeininner() {
				System.out.println("Methode from innermore");
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
testVor tv = new testVor();
testVor.inner i = tv.new inner();
testVor.inner.moreinner inner = i.new moreinner();
inner.Methodeininner();
//inner.noises();
				
			
		}
		List<List<Integer>> integer = Arrays.asList(Arrays.asList(1,2,34,4), Arrays.asList(1,23,4,5));
		
		List<Integer> newlist = integer.stream().flatMap(List::stream ).collect(Collectors.toList());
		
	//	newlist.forEach(System.out::println);
		
		
		int[] unique = {1,25,265,2,1,56,852,65544,526,749,25};
				
int result[]	 =	Arrays.stream(unique).distinct().toArray();
		//System.out.println(Arrays.toString(result));
											
			int [] iz = 
	
		
				
				 claculateWhitIndex(new int [] {5,3,6,25},9);
	//			 System.out.println(Arrays.toString(iz));
				 
//System.out.println(args[0]);			
		
		

 	
	public static int [] claculateWhitIndex(int nums[], int target) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				
				if (nums[i] + nums[j] == target) {
return new int[] {i,j};
				}
				
			}
		}
		return nums;
		
	}
	
}



//package exam.prog2.sose25_01.container;
//
////---------- Interface ----------
//public interface Queue<T> {
// void push_front(T elem);
// T pop_back() throws EmptyQueueException;
// boolean empty();
// void clear();
//}
//
////---------- Exception ----------
//class EmptyQueueException extends Exception {
// public EmptyQueueException(String message) {
//     super(message);
// }
//}
//
////---------- Node class ----------
//class Node<T> {
// T value;
// Node<T> next;
//
// Node(T value) {
//     this.value = value;
//     this.next = next;
// }
//}
			//	Aufgabe1
//---------- Implementation ----------
//public class QueueList<T> implements Queue<T> {
// private Node<T> head;
//
// public QueueList() {
//     head = null;
// }
//
// @Override
// public void push_front(T elem) {
//     Node<T> newNode = new Node<>(elem);
//     newNode.next = head;
//     head = newNode;
// }
//
// @Override
// public T pop_back() throws EmptyQueueException {
//     if (head == null) {
//         throw new EmptyQueueException("Queue is empty.");
//     }
//     if (head.next == null) { // Only one element
//         T value = head.value;
//         head = null;
//         return value;
//     }
//
//     Node<T> current = head;
//     while (current.next.next != null) {
//         current = current.next;
//     }
//     T value = current.next.value;
//     current.next = null;
//     return value;
// }
//
// @Override
// public boolean empty() {
//     return head == null;
// }
//
// @Override
// public void clear() {
//     head = null;
// }
//}

