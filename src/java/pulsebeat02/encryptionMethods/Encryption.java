package java.pulsebeat02.encryptionMethods;

public abstract class Encryption {
	
	public String getEncryptionMethods() {
		
		return "AES, BaseEncryption, Blowfish, DES/3DES/TripleDES, HMAC, IDEA, MD5, RSA, SHA, Twofish";
		
	}
	
	public String getVersion() {
		
		return "1.0.0";
		
	}
	
	public String getName() {
		
		return "Encryption";
		
	}
	
	public int RandomInt() {
		
		return (int)(Math.random() * 1000000);
		
	}

//	public int WrappertoPrimitive(Integer Integers) {
//		
//		return ArrayUtils.toPrimitive(Integers);
//		
//	}

}
