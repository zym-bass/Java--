package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo05_�ַ������ƷǴ��ı�ʧ�� {

	public static void main(String[] args) throws IOException{
          FileReader fr = new FileReader("D:\\1012ϵͳ��\\day06\\ͼ��\\�����������ڴ������.png");
          FileWriter fw = new FileWriter("D:\\����Copy.png");
          
          int len;
          char[] ch = new char[1024];
          while((len = fr.read(ch)) != -1) {
        	  fw.write(ch, 0, len);
          }
          
          fw.close();
          fr.close();
	}
}
