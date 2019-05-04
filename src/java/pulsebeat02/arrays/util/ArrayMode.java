package java.pulsebeat02.arrays.util;

public class ArrayMode {
	
	public double [] mode(double [] array) {
		
		double maxKey = 0;
		double maxCounts = 0;
		
		double [] out = {maxKey, maxCounts};

		double [] counts = new double[array.length + 5];

		    for (int i = 0; i < array.length; i++) {
		        
		        counts[(int) array[i]]++;
		        
		        if (maxCounts < counts[(int) array[i]]) {
		            
		            maxCounts = counts[(int) array[i]];
		            maxKey = array[i];
		            
		        }
		        
		    }
		    
		return out;
	}

}
