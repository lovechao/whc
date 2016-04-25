package com.test.des;

public class TestDES {

	public static void main(String[]args) throws Exception{
		 String plaintext = "abcd";

		      String ciphertext = DES.encryptDES(plaintext, "20120401");

		      System.out.println("明文：" + plaintext);

		      System.out.println("密钥：" + "20120401");

		     System.out.println("密文：" + ciphertext);

		      System.out.println("解密后：" + DES.decryptDES(ciphertext, "20120401"));
	}
}
