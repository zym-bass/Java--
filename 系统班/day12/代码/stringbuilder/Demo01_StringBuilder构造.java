package com.ujiuye.stringbuilder;

public class Demo01_StringBuilder构造 {

	public static void main(String[] args) {
		// "a" "b" "ab" "c" "abc" "d" "abcd" "e" "abcde"
		// 需要9块常量池空间, 比较浪费内存, 因此StringBuilder就是为了解决字符串拼接浪费内存问题
		String s = "a" + "b" + "c" + "d" + "e";
		
		// 1.StringBuilder() : 创建出一个字符串缓冲区, 默认初始容量大小为16字符
		StringBuilder sb = new StringBuilder();
		System.out.println(sb);
		
		// 2.StringBuilder(int count) : 创建出一个字符串缓冲区,初始容量大小为参数count
		StringBuilder sb1 = new StringBuilder(56);
		
		// 3.StringBuilder(String str) : 创建出一个字符串缓冲区, 容量为str.length() + 16
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb2);// abc
	}
}
