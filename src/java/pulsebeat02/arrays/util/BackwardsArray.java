package java.pulsebeat02.arrays.util;

public class BackwardsArray {
	
	public <T> T[] backwardArray (T[] array) {
		
		@SuppressWarnings("unchecked")
		T [] out = (T[]) new Object[array.length];
		
		for (int i = 0; i < array.length; i++) {
			
			out[i] = array[array.length - i -1];
			
		}
		
		return out;
	    
	}

}
