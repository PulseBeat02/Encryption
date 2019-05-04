package java.pulsebeat02.encryptionMethods.BaseEncyption;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseEncryption {
	
	public static int GenerateBaseKey(int min, int max) {
		
		return (int) Math.random() * max + min;
		
	}
	
	public static int [] GeneratePrimes() {
		
		int num1 = 0;
		int num2 = 0;
		
		int [] primes = {num1, num2};
		
        Random rand = new Random(); // generate a random number
        num1 = rand.nextInt(1000) + 1;
        num2 = rand.nextInt(1000) + 1;

        while (!isPrime(num1)) {  
        	
            num1 = rand.nextInt(1000) + 1;
            
        }
        
        while (!isPrime(num2)) {  
        	
            num2 = rand.nextInt(1000) + 1;
            
        }
        
        return primes;
		
	}
	
	private static boolean isPrime(int inputNum) {
		
		int divisor = 3;
		
        if (inputNum <= 3 || inputNum % 2 == 0) {
        	
            return inputNum == 2 || inputNum == 3; //this returns false if number is <=1 & true if number = 2 or 3
            
        }
        
        while ((divisor <= Math.sqrt(inputNum)) && (inputNum % divisor != 0)) {
        	
            divisor += 2; //iterates through all possible divisors
            
        }
        
        return inputNum % divisor != 0; //returns true/false
        
    }
	
	public String convertFromBaseToBase(String str, int fromBase, int toBase) {
		
	    return Integer.toString(Integer.parseInt(str, fromBase), toBase);
	    
	}
	
	static BigInteger convertBase(int number, int radix) {

        List<Integer> remainder = new ArrayList<>();

        int count = 0;
        
        String result = "";
        
        while (number != 0) {
        	
            remainder.add(count, number % radix != 0 ? number % radix : 0);
            
            number /= radix;
            
            try {
            	
                result += remainder.get(count);
                
            } catch( NumberFormatException e ) {
            	
                e.printStackTrace();
                
            }
            
        }
        
        return new BigInteger(new StringBuffer(result).reverse().toString());
    }
	
	public static int encrypt(int keySize, String message) {
		
		int [] primes = GeneratePrimes();
		
		int prime1 = primes[0];
		int prime2 = primes[1];
		int base = GenerateBaseKey(2, 1000000000);
		int product = prime1 * prime2;
		
		BigInteger rotKey = convertBase(product, base);
		
		
		
		return -1;
		
		
	}

}





















