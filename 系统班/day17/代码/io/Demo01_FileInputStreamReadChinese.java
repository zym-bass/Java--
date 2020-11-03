package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01_FileInputStreamReadChinese {

	public static void main(String[] args) throws IOException{
		 // 1. ��һ������Դ
         FileInputStream fis = new FileInputStream("chinese.txt");
         // 2. ʹ�õ����ֽڽ����ļ����ݶ�ȡ
         // len��ʾÿ�ζ�ȡ�����ֽڶ�Ӧ�����ݽ��
        /* int len;
         while((len = fis.read()) != -1) {
        	 System.out.print((char)len);
         }*/
         
         // 3. ʹ���ֽ������ȡ�ļ�����
         byte[] b = new byte[2];
         // len��ʾÿ�ζ�ȡ�����ֽڵĸ���
         int len;
         while((len = fis.read(b)) != -1) {
        	 System.out.print(new String(b,0,len));
         }
         fis.close();
	}
}
