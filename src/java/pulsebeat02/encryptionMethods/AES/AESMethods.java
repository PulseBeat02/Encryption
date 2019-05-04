package java.pulsebeat02.encryptionMethods.AES;

public abstract class AESMethods {
	
	public abstract String encrypt(String strToEncrypt, String secret);
	
	public abstract String decrypt(String strToDecrypt, String secret);

}
