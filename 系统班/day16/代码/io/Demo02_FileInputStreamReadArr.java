package com.ujiuye.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02_FileInputStreamReadArr {

	public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("first.txt");
        
       /* byte[] b = new byte[4];
        int i = fis.read(b);
        System.out.println(i);// 4
        System.out.println(new String(b));// hell
        int i2 = fis.read(b);
        System.out.println(i2);// 4
        System.out.println(new String(b));// owor
        int i3 = fis.read(b);
        System.out.println(i3);// 2
        System.out.println(new String(b));// Ԥ�����ld or
        int i4 = fis.read(b);
        System.out.println(i4);// -1
        System.out.println(new String(b));// ldor
*/        
        byte[] b = new byte[12];
        // len��ʾ��ȡ�����ֽڵĸ���
        int len;
        while((len = fis.read(b)) != -1) {
        	// b��ʾ��Ҫת�����ַ���������
        	// 0��ʾ��ȡ���������ʼ����λ��
        	// len��ʾҪ������b�ж�ȡ�������ֽ�ת�����ַ���
        	System.out.print(new String(b,0,len));
        }
        // һ��Ҫ�ر���Դ
        fis.close();
	}
}
