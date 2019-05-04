package java.pulsebeat02.arrays.util;

public class ArrayAverage {
	
	public double average(double [] array) {
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
			
		}
		
		return sum/array.length;
		
		
	}

}
