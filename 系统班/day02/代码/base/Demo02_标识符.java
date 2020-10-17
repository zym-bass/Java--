package com.ujiuye.base;

public class Demo02_标识符 {

	public static void main(String[] args) {
		// int 名字 = 10;
		int i = 10;
		// int class = 10; 关键字不能单独作为名字出现
		int class1 = 10;
		
		int _123 = 10;
		
		// int my name = 10; 名字中不能出现空格,特殊符号只有_和$可以作为名字出现
		int my_name$ = 10;
		
		// int 123abc = 10; 数字不能作为名字的开头
	}
}
