package de.tha.prog2.praktikum.game.container;

public interface Container<T> extends java.lang.Iterable<T> {
	/**
	 * Adds Element to the container
	 *
	 * @param o Element to add to the container
	 * @return true if this container changed as a result of the call
	 */
	boolean add(Object o);
	
	/**
	 * Gets the element from index i
	 * @param c Index of the Element
	 * @return
	 */
	 Object  get(int c) ;
		
	
	
	/**
	 * Gets the number of elements in the container
	 * @return Number of elements in the container
	 */
	int size();
	
	/**
	 * Removes the element from the container if it is contained in the container. 
	 * This will only remove the first instance of the object if the object is contained
	 * more than once in the container.
	 * 
	 * @param o Element to remove from the container
	 * @return true if the container changed because of the operation, false otherwise
	 */
	boolean remove(Object o);
	
	/**
	 * Checks if two containers are equal. They are considered equal if all elements 
	 * contained in the container are equal. This means both containers must have the 
	 * same number of elements and the equal elements must be in the same order.
	 * @param o Other container
	 * @return
	 */
	boolean equals(Object o);
	
	/**
	 * Removes all elements from the container
	 */
	default void clear() {
		
		

		Object[] elements = new Object[size()];
		for (Object object : elements) {
			remove(object);
		}
	}
	
	/**
	 * Checks if the object is contained in the container. The container 
	 * uses the equals()-Method to check if the object is in the container.
	 * 
	 * @param o Object to search for in the container
	 * @return true if the object is in the container, false otherwise
	 */
	default boolean contains(Object o) {		

for (int i = 0; i < size(); i++) {
	
	if (o.equals(get(i))) {
		return true;
	}
	
}
		
	
		
		return false;
		}
	
	/**
	 * Converts the container content to an array an returns the array
	 * @return Array containing all elements in the container
	 */
	default Object[] toArray() {
		
		Object [] Arr= new Object[size()] ;
		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = get(i);
		}
		
			
			
		
		return Arr;
		

		

	}
	
	/**
	 * Checks if the container contains any elements
	 * @return true if container is empty, false otherwise
	 */

default	boolean isEmpty() {
		return size()==0 ;
	}

	void  get(Container c);
	
	

  
}
