package java.pulsebeat02.encryptionMethods.SHA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA extends SHAMethods {

 public String GetSHA1(String passwordToHash, byte[] salt) {

  String generatedPassword = null;

  try {

   MessageDigest md = MessageDigest.getInstance("SHA-1");

   md.update(salt);

   byte[] bytes = md.digest(passwordToHash.getBytes());

   StringBuilder sb = new StringBuilder();

   for (int i = 0; i < bytes.length; i++) {

    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));

   }

   generatedPassword = sb.toString();

  } catch (NoSuchAlgorithmException e) {

   e.printStackTrace();

  }

  return generatedPassword;

 }

 public String GetSHA256(String passwordToHash, byte[] salt) {
	 
  String generatedPassword = null;
  
  try {

   MessageDigest md = MessageDigest.getInstance("SHA-256");

   md.update(salt);
   
   byte[] bytes = md.digest(passwordToHash.getBytes());
   
   StringBuilder sb = new StringBuilder();
   
   for (int i = 0; i < bytes.length; i++) {
	   
    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
    
   }
   
   generatedPassword = sb.toString();

  } catch (NoSuchAlgorithmException e) {

   // TODO Auto-generated catch block

   e.printStackTrace();

  }

  return generatedPassword;

 }

 public String GetSHA384(String passwordToHash, byte[] salt) {
	 
  String generatedPassword = null;
  
  try {

   MessageDigest md = MessageDigest.getInstance("SHA-384");

   md.update(salt);
   
   byte[] bytes = md.digest(passwordToHash.getBytes());
   
   StringBuilder sb = new StringBuilder();
   
   for (int i = 0; i < bytes.length; i++) {
	   
    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
    
   }
   
   generatedPassword = sb.toString();

  } catch (NoSuchAlgorithmException e) {

   // TODO Auto-generated catch block

   e.printStackTrace();

  }

  return generatedPassword;

 }

 public String GetSHA512(String passwordToHash, byte[] salt) {
	 
  String generatedPassword = null;
  
  try {

   MessageDigest md = MessageDigest.getInstance("SHA-512");

   md.update(salt);
   
   byte[] bytes = md.digest(passwordToHash.getBytes());
   
   StringBuilder sb = new StringBuilder();
   
   for (int i = 0; i < bytes.length; i++) {
	   
    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
    
   }
   
   generatedPassword = sb.toString();

  } catch (NoSuchAlgorithmException e) {

   // TODO Auto-generated catch block

   e.printStackTrace();
   
  }
  
  return generatedPassword;

 }

 //Add salt

 public byte[] getSalt() {

  SecureRandom sr = null;
  byte[] salt = null;

  try {

   sr = SecureRandom.getInstance("SHA1PRNG");
   
   salt = new byte[16];

  } catch (NoSuchAlgorithmException e) {

   // TODO Auto-generated catch block

   e.printStackTrace();
   
  }
  
  sr.nextBytes(salt);

  return salt;

 }

}