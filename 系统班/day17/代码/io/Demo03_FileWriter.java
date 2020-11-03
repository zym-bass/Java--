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
         
         // 1. 创建出一个字符输出流, 绑定一个数据目的
         FileWriter fw = new FileWriter(f);
         //A1a&中a&我爱我家,天气真好我家,天
         // 2. 向文件中写入数据
         // 写入单个字符
         fw.write('A');
         char[] ch = {'1','a','&','中'};
         // 写入字符数组
         fw.write(ch);
         // 写入字符数组一部分
         fw.write(ch, 1, 2);
         // 刷新数组缓冲区中数据到文件中
         fw.flush();
         String s = "我爱我家,天气真好";
         // 写入字符串
         fw.write(s);
         // 写入字符串一部分
         fw.write(s, 2, 4);
         // 3. 一定要关闭资源
         fw.close();
         // 关闭流资源之后, 流不能再继续使用, 否则代码会报错 : IOException
         // fw.write("helloworld");
	}

}
