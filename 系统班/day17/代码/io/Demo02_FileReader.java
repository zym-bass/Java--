package com.ujiuye.io;

import java.io.FileReader;
import java.io.IOException;

public class Demo02_FileReader {

	public static void main(String[] args) throws IOException{
        // 1. 创建出一个字符输入流, 绑定一个数据源
		FileReader fr = new FileReader("chinese.txt");
		// 2. 使用单个字符读取文件内容
		// len表示读取到的字符在编码表中对应的整数结果
		int len;
		while((len = fr.read()) != -1 ) {
			System.out.println(len);// 22823
			System.out.print((char)len);
		}
		
		/*// 3. 使用字符数组读取文件内容
		char[] ch = new char[3];
		// len表示读取到的字符的个数
		int len;
		while((len = fr.read(ch)) != -1) {
			System.out.print(new String(ch, 0, len));
		}*/
		fr.close();
	}

}
