package java.pulsebeat02.encryptionMethods.Blowfish;

public abstract class BlowfishMethods {
	
	public abstract String encrypt(String myKey, String text);
	
	public abstract String decrypt(String myKey, byte[] text);

}
