package java.pulsebeat02.encryptionMethods.RSA_Security.RC5;

import java.pulsebeat02.encryptionMethods.RSA_Security.RSAMethods;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class RC5 extends RSAMethods {
	
	private static String algorithm = "RC5";
	
	public byte[] encryptRC5(String toEncrypt, String key) {
		
	      SecureRandom sr = new SecureRandom(key.getBytes());
	      
	      KeyGenerator kg = null;
	      
		try {
			
			kg = KeyGenerator.getInstance(algorithm);
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	      
	      kg.init(sr);
	      
	      SecretKey sk = kg.generateKey();
	  
	      // create an instance of cipher
	      
	      Cipher cipher = null;
	      
		try {
			
			cipher = Cipher.getInstance(algorithm);
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (NoSuchPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	  
	      // initialize the cipher with the key
	      
	      try {
	    	  
			cipher.init(Cipher.ENCRYPT_MODE, sk);
			
		} catch (InvalidKeyException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	  
	      // encrypt!
	      
	      byte[] encrypted = null;
	      
		try {
			
			encrypted = cipher.doFinal(toEncrypt.getBytes());
			
		} catch (IllegalBlockSizeException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (BadPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	  
	      return encrypted;
	      
	   }
	  
	   public String decryptRC5(byte[] toDecrypt, String key) {
		   
	      // create a binary key from the argument key (seed)
		   
	      SecureRandom sr = new SecureRandom(key.getBytes());
	      
	      KeyGenerator kg = null;
		try {
			kg = KeyGenerator.getInstance(algorithm);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      kg.init(sr);
	      
	      SecretKey sk = kg.generateKey();
	  
	      // do the decryption with that key
	      
	      Cipher cipher = null;
	      
		try {
			
			cipher = Cipher.getInstance(algorithm);
			
		} catch (NoSuchAlgorithmException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (NoSuchPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	      
	      try {
	    	  
			cipher.init(Cipher.DECRYPT_MODE, sk);
			
		} catch (InvalidKeyException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	      
	      byte[] decrypted = null;
	      
		try {
			
			decrypted = cipher.doFinal(toDecrypt);
			
		} catch (IllegalBlockSizeException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		} catch (BadPaddingException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			
		}
	  
	      return new String(decrypted);
	      
	   }

	@Override
	public byte[] encryptRC4(byte[] plaintext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] decryptRC4(byte[] ciphertext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] convBytesWords(byte[] key, int u, int c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] generateSubkeys(byte[] key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] paddingKey(byte[] key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] encryptRC6(byte[] data, byte[] key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] decryptRC6(byte[] data, byte[] key) {
		// TODO Auto-generated method stub
		return null;
	}

}
