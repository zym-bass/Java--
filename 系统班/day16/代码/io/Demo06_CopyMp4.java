package com.ujiuye.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo06_CopyMp4 {

	public static void main(String[] args) throws IOException{
		// �ļ����� : ʹ�ø�Ч��������Դ������Ƶ
		// 1. ������һ���ֽڸ�Ч����������, ��һ������Դ
		FileInputStream bis = new FileInputStream(
				"D:\\1012ϵͳ��\\day01\\��Ƶ\\01.Java�����.mp4");
		
		// 2. ������һ���ֽڸ�Ч���������, ��һ������Ŀ��
		FileOutputStream fos = new FileOutputStream(
				"D:\\01.Java�����Copy.mp4");
		
		long beginTime = System.currentTimeMillis();
		// len��ʾÿ�ζ�ȡ���ֽ�����
		int len;
		while((len = bis.read()) != -1) {
			fos.write(len);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-beginTime);
        fos.close();
        bis.close();
	}

}
