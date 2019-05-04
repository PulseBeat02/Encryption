package java.pulsebeat02.encryptionMethods.HMAC;

public abstract class HMACMethods {
	
	public abstract String encrypt(byte[] bytes);
	
	public abstract String calculateHMAC(String data, String key, String text);

}
