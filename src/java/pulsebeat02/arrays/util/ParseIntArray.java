package java.pulsebeat02.arrays.util;

public class ParseIntArray {
	
	public int [] parseIntArray(String [] array) {
		
		int [] out = new int[array.length];
		int [] errored = {-1};
		
		for (int i = 0; i < array.length; i++) {
			
			try {
			
				out[i] = Integer.parseInt(array[i]);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				return errored;
				
			}
			
		}
		
		return out;
		
	}

}
