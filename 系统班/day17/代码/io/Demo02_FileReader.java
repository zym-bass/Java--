package com.ujiuye.io;

import java.io.FileReader;
import java.io.IOException;

public class Demo02_FileReader {

	public static void main(String[] args) throws IOException{
        // 1. ������һ���ַ�������, ��һ������Դ
		FileReader fr = new FileReader("chinese.txt");
		// 2. ʹ�õ����ַ���ȡ�ļ�����
		// len��ʾ��ȡ�����ַ��ڱ�����ж�Ӧ���������
		int len;
		while((len = fr.read()) != -1 ) {
			System.out.println(len);// 22823
			System.out.print((char)len);
		}
		
		/*// 3. ʹ���ַ������ȡ�ļ�����
		char[] ch = new char[3];
		// len��ʾ��ȡ�����ַ��ĸ���
		int len;
		while((len = fr.read(ch)) != -1) {
			System.out.print(new String(ch, 0, len));
		}*/
		fr.close();
	}

}
