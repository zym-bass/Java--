package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04_�ַ���Copy {

	public static void main(String[] args) throws IOException{
         // 1. ������һ���ַ�������, ��ȡ�ļ� , ��һ������Դ
		 FileReader fr = new FileReader("abc.txt");
		 // 2. ������һ���ַ������, д���ļ�, ��һ������Ŀ��
		 FileWriter fw = new FileWriter("abcCopy.txt");
		 // len��ʾÿ�ζ�ȡ�����ַ��ĸ���
		 int len;
		 char[] ch = new char[10];
		 while((len = fr.read(ch)) != -1) {
			 fw.write(ch, 0, len);
		 }
		 
		 fw.close();
		 fr.close();
	}
}
