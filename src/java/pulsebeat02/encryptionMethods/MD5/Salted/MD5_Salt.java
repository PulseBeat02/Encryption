package java.pulsebeat02.encryptionMethods.MD5.Salted;

import java.pulsebeat02.encryptionMethods.MD5.MD5Methods;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class MD5_Salt extends MD5Methods {
	
	public byte[] getSalt() {
		
	    //Always use a SecureRandom generator
		
	    SecureRandom sr = null;
	    byte[] salt = new byte[16];
	    
		try {
			
			sr = SecureRandom.getInstance("SHA1PRNG");
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
	    //Create array for salt
		
	    
	    
	    //Get a random salt
	    
	    sr.nextBytes(salt);
	    
	    //return salt
	    
	    return salt;
	    
	}
	
	public String getSecurePassword(String passwordToHash, byte[] salt) {
		
        String generatedPassword = null;
        
        try {
        	
            // Create MessageDigest instance for MD5
        	
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            //Add password bytes to digest
            
            md.update(salt);
            
            //Get the hash's bytes
            
            byte[] bytes = md.digest(passwordToHash.getBytes());
            
            //This bytes[] has bytes in decimal format;
            
            //Convert it to hexadecimal format
            
            StringBuilder sb = new StringBuilder();
            
            for(int i=0; i< bytes.length; i++) {
            	
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                
            }
            
            //Get complete hashed password in hex format
            
            generatedPassword = sb.toString();
            
        }
        
        catch (NoSuchAlgorithmException e) {
        	
            e.printStackTrace();
            
        }
        
        return generatedPassword;
    }

	@Override
	public String generate(String passwordToHash, String generatedPassword) {
		
		// TODO Auto-generated method stub
		
		return null;
		
	} 

}
