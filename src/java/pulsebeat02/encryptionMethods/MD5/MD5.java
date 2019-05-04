package java.pulsebeat02.encryptionMethods.MD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 extends MD5Methods {
    
    public String generate(String passwordToHash, String generatedPassword) {
    
    	try {
    	
    		// Create MessageDigest instance for MD5
    	
    		MessageDigest md = MessageDigest.getInstance("MD5");
        
    		//Add password bytes to digest
        
    		md.update(passwordToHash.getBytes());
        
    		//Get the hash's bytes
        
    		byte[] bytes = md.digest();
        
    		//This bytes[] has bytes in decimal format;
        
    		//Convert it to hexadecimal format
        
    		StringBuilder sb = new StringBuilder();
        
    		for(int i=0; i< bytes.length ;i++) {
        	
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
	public byte[] getSalt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSecurePassword(String passwordToHash, byte[] salt) {
		// TODO Auto-generated method stub
		return null;
	}

}
