package com.ujiuye.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01_FileInputStream {

	// ������ʱ�鿴����֮��ļ̳й�ϵ : ����궨λ��������, ctrl + T���Բ鿴������͵ļ̳й�ϵ
	public static void main(String[] args) throws IOException{
         // 1. ������һ���ֽ�������, �൱�ڰ�һ������Դ
		 FileInputStream fis = new FileInputStream("D:\\aabbc.txt");
		 // ע�� : IO����Դֻ�ܲ����ļ�, ���ܲ����ļ���
		 // FileInputStream fis1 = new FileInputStream(new File("D:\\1012ϵͳ��"));
	     /*int first = fis.read();
	     int second = fis.read();
	     int thrid = fis.read();
	     int four = fis.read();
	     int five = fis.read();
	     int six = fis.read();
		 System.out.println(first);// 97
		 System.out.println(second);// 98
		 System.out.println(thrid);// 99
		 System.out.println(four);// 33
		 System.out.println(five);// -1
		 System.out.println(six);// -1
    */		 
		 // len��ʾÿ�ζ�ȡ�����ֽ�����
		 int len;
		 while((len = fis.read()) != -1) {
			 System.out.print((char)len);
		 }
		 
		 // һ��Ҫ�ر���Դ
		 fis.close();
	}
}
