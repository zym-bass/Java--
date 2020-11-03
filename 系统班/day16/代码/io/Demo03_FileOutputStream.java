package com.ujiuye.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03_FileOutputStream {

	public static void main(String[] args) throws IOException{
		File f = new File("second.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
        // 1. ������һ���ֽ������, �൱�ڰ�һ������Ŀ��
		FileOutputStream fos = new FileOutputStream(f);
		//aABCDECD
		// 2. ���ļ���д������
		// 1)write(int b) : ���ֽ�����bд�뵽�ļ���
		fos.write(97);// a
		fos.write(65);// A
		
		byte[] b = {66,67,68,69};
		// 2)write(byte[] b) : ���ֽ�����b�е���������д�뵽�ļ���
		fos.write(b);
		
		// 3)write(byte[] b, int index, int length) : ������b��index����λ�ÿ�ʼ, 
		// д��length���ֽڵ��ļ���
		fos.write(b, 1, 2);// 67 68
		
		// getBytes() : ���ַ���ת���ֽ�����
		fos.write("���".getBytes());
		
		// �ǵùر���Դ
		fos.close();
	}
}
