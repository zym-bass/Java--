package com.ujiuye.homework17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {

	public static void main(String[] args) throws IOException{
        // ��Ϊ�ļ��ı��뼯Ϊ : UTF-8, ���ʹ��ת������ȡ�ļ�����, �����ļ��������뼯��ȡ,��ֹ��������
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("D:\\�ļ�.txt"), "UTF-8");
		
		char[] ch = new char[1024];
		StringBuilder sb = new StringBuilder();
		// len��ʾÿ�ζ�ȡ�����ַ�����
		int len;
		while((len = isr.read(ch)) != -1) {
			sb.append(new String(ch,0,len));
		}
		
		System.out.println(sb);
		isr.close();
	}
}
