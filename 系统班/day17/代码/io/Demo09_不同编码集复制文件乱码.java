package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo09_不同编码集复制文件乱码 {

	public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("UTF-8.txt");
        FileOutputStream fos = new FileOutputStream("GBK.txt");
        
        int len;
        while((len = fis.read()) != -1) {
        	fos.write(len);
        }
        
        fos.close();
        fis.close();
	}
}
