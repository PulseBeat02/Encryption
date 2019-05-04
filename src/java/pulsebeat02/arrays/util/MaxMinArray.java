package java.pulsebeat02.arrays.util;

public class MaxMinArray {
	
	public int [] backwardArray (int array []) {
		
		int maxValue = array[0];
		int minValue = array[0];
		
		int [] output = {maxValue, minValue};
		  
		  for (int i=1;i < array.length;i++) {
		      
		    if(array[i] > maxValue){
		        
			  maxValue = array[i];
			  
			}
			
		  }	  
		  
		  for(int i=1; i < array.length; i++) {
		      
		    if(array[i] < minValue){
		        
			  minValue = array[i];
			  
			}
			
		  }
		  
		  return output;
		
	}

}
