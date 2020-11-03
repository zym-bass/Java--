package com.ujiuye.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03_FileWriter {

	public static void main(String[] args) throws IOException{
         File f = new File("abc.txt");
         if(!f.exists()) {
        	 f.createNewFile();
         }
         
         // 1. ������һ���ַ������, ��һ������Ŀ��
         FileWriter fw = new FileWriter(f);
         //A1a&��a&�Ұ��Ҽ�,��������Ҽ�,��
         // 2. ���ļ���д������
         // д�뵥���ַ�
         fw.write('A');
         char[] ch = {'1','a','&','��'};
         // д���ַ�����
         fw.write(ch);
         // д���ַ�����һ����
         fw.write(ch, 1, 2);
         // ˢ�����黺���������ݵ��ļ���
         fw.flush();
         String s = "�Ұ��Ҽ�,�������";
         // д���ַ���
         fw.write(s);
         // д���ַ���һ����
         fw.write(s, 2, 4);
         // 3. һ��Ҫ�ر���Դ
         fw.close();
         // �ر�����Դ֮��, �������ټ���ʹ��, �������ᱨ�� : IOException
         // fw.write("helloworld");
	}

}
