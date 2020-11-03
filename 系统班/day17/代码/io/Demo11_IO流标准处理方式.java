package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo11_IO流标准处理方式 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			 fis = new FileInputStream("abc.txt");
	         fos = new FileOutputStream("abcCopy.txt");
	         
	         int len;
	         while((len = fis.read()) != -1) {
	        	 fos.write(len);
	         }

		}catch(IOException ex) {
			 ex.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}finally {
				 try {
					 if(fis != null) {
						 fis.close();
					 }
				 }catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
