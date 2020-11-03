package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo12_JDK7IO流资源新异常处理 {
   public static void main(String[] args) {
	   try(
			   FileInputStream fis = new FileInputStream("abc.txt");  
			   FileOutputStream fos = new FileOutputStream("abcCopy.txt");
		){
		     int len;
	         while((len = fis.read()) != -1) {
	        	 fos.write(len);
	         }
		   
	   }catch(IOException ex) {
		   ex.printStackTrace();
	   }
   }
}
