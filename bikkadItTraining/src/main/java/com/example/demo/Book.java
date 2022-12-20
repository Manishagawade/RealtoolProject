package com.example.demo;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Book {
 public String encrptions(String password) {
	 
	 //create Encoder object
	Encoder encoder = Base64.getEncoder();
	
	//converting String to byte[]
	byte[] bytes = password.getBytes();
	
	//doing encoding 
	byte[] encode = encoder.encode(bytes);
	String newcode = encode.toString();
	return newcode;
 }
 public static void main(String[] args) {
	Book book =new Book();
	String encrptions = book.encrptions("Dear");
	System.out.println(encrptions);
}
}
