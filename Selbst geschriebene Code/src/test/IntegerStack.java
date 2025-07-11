package test;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;


public class IntegerStack {
	private int [] storage;
	private int heigth;
	public IntegerStack(int[] storage, int heigth) {
		this.storage = storage;
		this.heigth = heigth;
	}
	

	private boolean empty() {

return heigth==0;
	}
	private void push(int p) {
	
	       if (empty())
	            throw new EmptyStackException();
	       
	    	     if (heigth==storage.length ) {
	    		      int newarray[] = new int [(int) (storage.length*4)]  ;
	    		      System.arraycopy(storage, 0, newarray, 0, storage.length);
	    		      storage=newarray;
	    		      

	    			}
	    	     storage[heigth++]=p;
	    	     
		
	  

		
	}
	private int pop() {
	
		if (empty()) {
throw new IllegalArgumentException("Stack leer");
		}
heigth--;
return storage[heigth];
	        
	}
	private int top() {
//		Stack< Integer> s = new Stack<>();
//		s.peek();
//		s.push(null);

	        if (empty())
	            throw new EmptyStackException();
	        return storage[ heigth-1];
		
	}

	@Override
	public String toString() {
		return "IntegerStack [storage=" + Arrays.toString(storage) + ", heigth=" + heigth + "]";
	}
	
}
