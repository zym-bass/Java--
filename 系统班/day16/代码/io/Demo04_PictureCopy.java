package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04_PictureCopy {

	public static void main(String[] args) throws IOException{
       // 1. ������һ���ֽ�������, ��һ������Դ
	   FileInputStream fis = new FileInputStream("D:\\1012ϵͳ��\\day02\\ͼ��\\��������͸�ֵ����.png");
	   // 2.  ������һ���ֽ������, ��һ������Ŀ��
	   FileOutputStream fos = new FileOutputStream("D:\\��������copy2.png");
	   
	   // 3. �����ֽڸ���
	   // len��ʾÿ�ζ�ȡ�����ֽ����ݽ��
	   /*int len;
	   while((len = fis.read()) != -1) {
		   fos.write(len);
	   }*/
	   
	   // 4. ʹ���ֽ������д�ļ�, ���Ч��
	   byte[] b = new byte[1024*4];
	   // len��ʾ��ȡ�����ֽڵĸ���
	   int len;
	   while((len = fis.read(b)) != -1) {
		   fos.write(b, 0, len);
	   }
	   
	   fos.close();
	   fis.close();
	}
}
