package java.pulsebeat02.encryptionMethods.Twofish;

public abstract class TwofishMethods {
	
	public abstract String encrypt(String CipherMode, int KeyLength, int PaddingScheme, String EncodingMode, String ivHex, String keyHex, String message, boolean task);

}
