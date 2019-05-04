package java.pulsebeat02.encryptionMethods.MD5;

public abstract class MD5Methods {
	
	public abstract String generate(String passwordToHash, String generatedPassword);
	
	public abstract byte[] getSalt();
	
	public abstract String getSecurePassword(String passwordToHash, byte[] salt);

}
