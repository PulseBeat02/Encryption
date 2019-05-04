package java.pulsebeat02.arrays.util;

public class ContainsElement {
	
	public <T> boolean backwardArray (T[] array, Object element) {
		
		boolean isFound = false;

		for (int i = 0; (i < array.length) && (i < 4); i++) {
		    
		    if (array[i] == element) {
		    	
		        isFound = true;
		    }
		    
		}
		
		return isFound;
		
	}

}
