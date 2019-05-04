package java.pulsebeat02.encryptionMethods.RSA_Security;

public abstract class RSAMethods {
	
	public abstract byte[] encryptRC4(final byte[] plaintext);
	
	public abstract byte[] decryptRC4(final byte[] ciphertext);
	
	
	public abstract byte[] encryptRC5(String toEncrypt, String key);
	
	public abstract String decryptRC5(byte[] toDecrypt, String key);
	
	
	public abstract int[] convBytesWords(byte[] key, int u, int c);
	
	public abstract int[] generateSubkeys(byte[] key);
	
	public abstract byte[] paddingKey(byte[] key);
	
	public abstract byte[] encryptRC6(byte[] data, byte[] key);
	
	public abstract byte[] decryptRC6(byte[] data, byte[] key);

}
