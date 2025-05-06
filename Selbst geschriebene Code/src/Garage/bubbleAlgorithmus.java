package Garage;



public class bubbleAlgorithmus extends Object {
	
	static void bubble (int []array) {
		
		boolean swapped;
		int n = array.length;
		for(int i =0;i<n-1;i++) {
			
			swapped = false;
			
		
		
		 for(int j=0;j<-i-1;j++) {
			 
			 
			 if(array[j] > array[j+1]) {
				 
				 int temp;
				 temp = array[j];
				 array[j] = array[j+1];
				 array[j+1] = temp;
				 
				 swapped = true;
			 	 }
			 
		 }
		if(!swapped) {
			break;
			
		}
	}
	}
}