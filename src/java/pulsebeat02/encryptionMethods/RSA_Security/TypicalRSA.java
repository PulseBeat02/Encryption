package java.pulsebeat02.encryptionMethods.RSA_Security;

import java.math.BigInteger;
import java.util.Random;

public class TypicalRSA {
	
	static BigInteger p;
	static BigInteger q;
	static BigInteger n;
	static BigInteger m;
	static BigInteger e;
	static BigInteger d;
	
	public void generateKeys(String[] a) {

		      if (a.length < 1) {
		         System.out.println("Usage:");
		         System.out.println("java RsaKeyGenerator size");
		         return;
		      }
		      
		      int size = Integer.parseInt(a[0]);

		      Random rnd = new Random();
		      p = BigInteger.probablePrime(size/2,rnd);
		      q = p.nextProbablePrime();
		      n = p.multiply(q);
		      m = (p.subtract(BigInteger.ONE)).multiply(
		         q.subtract(BigInteger.ONE));
		      e = getCoprime(m);
		      d = e.modInverse(m);
		      
		}
		
	public static BigInteger getCoprime(BigInteger m) {
		
		 Random rnd = new Random();
		 
		 int length = m.bitLength() - 1;
		 
		 BigInteger e = BigInteger.probablePrime(length,rnd);
		 
		 while (! (m.gcd(e)).equals(BigInteger.ONE) ) {
			 
		      	 e = BigInteger.probablePrime(length,rnd);
		      	 
		      }
		 
		      return e;
		      
	}
	
	public static BigInteger getPublicKey() {
		
		return e;
		
	}
	
	public static BigInteger getPrivateKey() {
		
		return d;
		
	}
	
	public static BigInteger getModulus() {
		
		return n;
		
	}
	
	public static BigInteger getP() {
		
		return p;
		
	}
	
	public static BigInteger getQ() {
		
		return q;
		
	}
	
	public static int gcd (int a, int b) { 
		
        if (a == 0) {
        	
            return b; 
            
        }
        
        return gcd(b % a, a); 
        
    } 
  
    // Euler Totient Function 
	
    public static int phi (int n) { 
    	
        int result = 1; 
        
        for (int i = 2; i < n; i++) {
        	
            if (gcd(i, n) == 1) {
            	
                result++; 
                
            }
            
        }
        
        return result; 
        
    }
    
    public static int getPrivateKey(int k, int n, int e) {
    	
    	return (k * phi(n) + 1)/e;
    	
    }

}













