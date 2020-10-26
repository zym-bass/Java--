package com.ujiuye.string;

import java.util.Arrays;

public class Demo05_String转换功能 {

	public static void main(String[] args) {
        
		String s = "ABCDEF";
		// 1.getBytes() : 将方法调用字符串转换成字符, 再通过平台默认编码表将字符转换成字节数据, 将转换结果存储在byte[]中
		byte[] b = s.getBytes();
		System.out.println(Arrays.toString(b));//[65, 66, 67, 68, 69, 70]
		
		// 2.toCharArray() : 将方法调用字符串转换成字符数组,  将转换结果存储在char[]中
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		for(int index = 0; index < ch.length; index++) {
			System.out.print(ch[index] + "  ");
		}
		System.out.println();
		
		// 3.toUpperCase() : 将方法调用字符串中的所有字符(字母)转换成大写, 返回转换之后的新字符串结果
		String s1 = "HelloWorld";
		System.out.println(s1.toUpperCase());// HELLOWORLD
		
		// 4. toLowerCase() : 将方法调用字符串中的所有字符(字母)转换成小写, 返回转换之后的新字符串结果
		System.out.println(s1.toLowerCase());// helloworld
		
		// 5.static valueOf(Object obj) : 可以将其他任意数据类型转换成字符串类型, 方法本身是重载方法, 也可以将基本数据类型转换成字符串类型
		String result = String.valueOf(10) + 1;
		System.out.println(result);// 101
		
		String ss = String.valueOf(new Object());
		System.out.println(ss);
	}
}
