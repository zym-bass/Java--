package com.ujiuye.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo05_字符流复制非纯文本失败 {

	public static void main(String[] args) throws IOException{
          FileReader fr = new FileReader("D:\\1012系统班\\day06\\图解\\两个对象在内存中理解.png");
          FileWriter fw = new FileWriter("D:\\对象Copy.png");
          
          int len;
          char[] ch = new char[1024];
          while((len = fr.read(ch)) != -1) {
        	  fw.write(ch, 0, len);
          }
          
          fw.close();
          fr.close();
	}
}
