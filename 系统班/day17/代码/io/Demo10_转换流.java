package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo10_ת���� {

	public static void main(String[] args) throws IOException{
        // 1. ������һ��������, ��ȡ�ļ�
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("UTF-8.txt"), "UTF-8");
		
		// 2. ������һ�������, ���ļ���д������
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream("GBK.txt"), "GBK");
		
		int len;
		while((len = isr.read()) != -1) {
			osw.write(len);
		}
		
		osw.close();
		isr.close();
	}
}
