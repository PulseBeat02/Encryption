package java.pulsebeat02.encryptionMethods.Caesar_Cipher;

public class Caesar_Cipher extends Caesar_CipherMethods {
	
	public static StringBuffer encrypt(String text, int s) { 
		
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) { 
        	
            if (Character.isUpperCase(text.charAt(i))) { 
            	
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65); 
                
                result.append(ch); 
                
            } 
            
            else { 
            	
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97); 
                
                result.append(ch); 
                
            } 
            
        } 
        
        return result; 
        
    }
	
	public static StringBuffer decrypt(String text, int s) {
		
		return encrypt(text, 26 - s);
		
	}

}
