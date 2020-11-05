package com.ujiuye.homework17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {

	public static void main(String[] args) throws IOException{
        // 因为文件的编码集为 : UTF-8, 因此使用转换流读取文件内容, 按照文件给出编码集读取,防止发生乱码
		InputStreamReader isr = new InputStreamReader(
				new FileInputStream("D:\\文件.txt"), "UTF-8");
		
		char[] ch = new char[1024];
		StringBuilder sb = new StringBuilder();
		// len表示每次读取到的字符个数
		int len;
		while((len = isr.read(ch)) != -1) {
			sb.append(new String(ch,0,len));
		}
		
		System.out.println(sb);
		isr.close();
	}
}
