package java.pulsebeat02.encryptionMethods.Blowfish;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Blowfish extends BlowfishMethods {
	
	public String encrypt(String myKey, String text) {
		
		SecretKeySpec key = null;
		Cipher cipher = null;
		
		String encryptedData = null;
		
		try {
			
			key = new SecretKeySpec(myKey.getBytes("UTF-8"), "Blowfish");
			
		} catch (UnsupportedEncodingException e2) {
			
			// TODO Auto-generated catch block
			
			e2.printStackTrace();
			
		}
        
		try {
			
			cipher = Cipher.getInstance("Blowfish");
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (NoSuchPaddingException e) {
			
			e.printStackTrace();
			
		}
		
        if (cipher == null || key == null) {
        	
            try {
            	
				throw new Exception("Invalid key or cypher");
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
            
        }
        
        try {
        	
			cipher.init(Cipher.ENCRYPT_MODE, key);
			
		} catch (InvalidKeyException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
        
        try {
        	
			encryptedData = new String(cipher.doFinal(text.getBytes("UTF-8")));
			
		} catch (IllegalBlockSizeException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (BadPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (UnsupportedEncodingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
        
        return encryptedData;
		
	}
	
	public String decrypt(String myKey, byte[] text) {
		
		SecretKeySpec key = null;
		Cipher cipher = null;
		byte[] decrypted = null;
		
		try {
			
			key = new SecretKeySpec(myKey.getBytes("UTF-8"), "Blowfish");
			
		} catch (UnsupportedEncodingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
        
		try {
			
			cipher = Cipher.getInstance("Blowfish");
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (NoSuchPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
		
        try {
        	
			cipher.init(Cipher.DECRYPT_MODE, key);
			
		} catch (InvalidKeyException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
        
        try {
        	
			decrypted = cipher.doFinal(text);
			
		} catch (IllegalBlockSizeException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (BadPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
        
        return new String(decrypted);
		
	}

}
