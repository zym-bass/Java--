package com.ujiuye.string;

public class Demo02_String构造 {

	public static void main(String[] args) {
         // 1. String()
		 String s = new String();// ""  String s1 = "";
		 System.out.println(s + "---");
		 
		 // 2. String(String str)
		 // s1通过new创建对象, s1指向堆内存空间地址
		 String s1 = new String("123");
		 System.out.println(s1);
		 // s2指向常量池中内存地址, s1和s2内容上相同, 但是地址值不同的
		 String s2 = "123";
		 System.out.println(s1 == s2);// false
		 
		 // 3.String(byte[] b) : 将字节数组转换成一个字符串; 将字节数据参考平台默认编码表, 将字节转换成对应的字符, 拼接字符形成一个字符串
		 byte[] b = {97,98,99,100}; // abcd
		 String s3 = new String(b);
		 System.out.println(s3);// abcd
		 
		 /*4.String(byte[] b, int beginIndex, int length): 将字节数组的一部分转换成字符串
		   a : beginIndex表示从字节数组的某一个索引位置开始
		   b : length 表示需要截取的长度(个数) */
		 String s4 = new String(b,1,2); 
		 System.out.println(s4);// bc
		 
		 // 5.String(char[] ch) : 将字符数组转换成一个字符串; 直接将参数ch字符数组中的每一个字符获取到, 拼接成一个字符串
	     char[] ch = {'1','A','>','夹','z'};
	     String s5 = new String(ch);
	     System.out.println(s5);//1A>夹z
	     
	     /*6.String(char[] ch, int beginIndex, int length): 将字符数组的一部分转换成字符串; 
	     a : beginIndex表示从字节数组的某一个索引位置开始
	     b : length 表示需要截取的长度(个数)*/
	     String s6 = new String(ch,0,3);
	     System.out.println(s6);// 1A>
	}
}
