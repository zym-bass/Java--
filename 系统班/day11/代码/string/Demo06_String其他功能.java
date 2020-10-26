package com.ujiuye.string;

public class Demo06_String其他功能 {

	public static void main(String[] args) {
       // 1.replace(String old, String newStr): 将字符串中所有的old字符串内容替换成newStr字符串内容, 将替换之后的字符串结果作为方法的返回值
	   String s = "helloworld";
	   String newStr = s.replace("l", "*");
	   System.out.println(newStr);//he**owor*d
	   
	   // 2.trim() : 将字符串中前后的空格去除掉, 字符串中空格无法去除, 将去掉空格的字符串结果作为方法的返回值
	   String s1 = "  123  abc            ";
	   System.out.println(s1.trim());
	}
}
