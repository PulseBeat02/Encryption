package java.pulsebeat02.encryptionMethods.SHA;

public abstract class SHAMethods {
	
	public abstract String GetSHA1(String passwordToHash, byte[] salt);
	
	public abstract String GetSHA256(String passwordToHash, byte[] salt);
	
	public abstract String GetSHA384(String passwordToHash, byte[] salt);
	
	public abstract String GetSHA512(String passwordToHash, byte[] salt);
	
	public abstract byte[] getSalt();

}
