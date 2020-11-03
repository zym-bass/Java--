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
        System.out.println(new String(b));// 预想读到ld or
        int i4 = fis.read(b);
        System.out.println(i4);// -1
        System.out.println(new String(b));// ldor
*/        
        byte[] b = new byte[12];
        // len表示读取到的字节的个数
        int len;
        while((len = fis.read(b)) != -1) {
        	// b表示需要转换成字符串的数组
        	// 0表示读取的数组的起始索引位置
        	// len表示要从数组b中读取出几个字节转换成字符串
        	System.out.print(new String(b,0,len));
        }
        // 一定要关闭资源
        fis.close();
	}
}
