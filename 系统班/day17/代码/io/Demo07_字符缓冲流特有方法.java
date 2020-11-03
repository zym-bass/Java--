package com.ujiuye.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo07_字符缓冲流特有方法 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
        		new FileReader("javaCode.txt"));
        
        BufferedWriter bw = new  BufferedWriter(
        		new FileWriter("javaCodeCopy.txt"));
        
        // s表示每次读取到的一行内容
        String s;
        while((s = br.readLine()) != null) {
        	bw.write(s);
        	// 向文件中写入回车换行
        	bw.newLine();
        }
        
        bw.close();
        br.close();
	}

}
