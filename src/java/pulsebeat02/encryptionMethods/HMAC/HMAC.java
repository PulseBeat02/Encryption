package java.pulsebeat02.encryptionMethods.HMAC;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMAC extends HMACMethods {
	
	public String encrypt(byte[] bytes) {
		
	    Formatter formatter = new Formatter();
	    
	    for (byte b : bytes) {
	    	
	        formatter.format("%02x", b);
	        
	    }
	    
	    formatter.close();
	    
	    return formatter.toString();
	    
	}
	
	public String calculateHMAC(String data, String key, String text) {
		
		    SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), text);
		    Mac mac = null;
		    
			try {
				
				mac = Mac.getInstance(text);
				
			} catch (NoSuchAlgorithmException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				
			}
			
		    try {
		    	
				mac.init(secretKeySpec);
				
			} catch (InvalidKeyException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				
			}
		    
		    return encrypt(mac.doFinal(data.getBytes()));
		    
		}

}
