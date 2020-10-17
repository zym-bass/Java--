package com.ujiuye.variable;

public class Demo06_字符类型与ASCII编码表 {

	public static void main(String[] args) {
		char ch = 'a';
		// 1) ch参考编码表, 得到97,提升类型为int
		//  2) 97 + 5 = 102(int类型)
		int result = ch + 5;
		System.out.println(result);// 102
		
		char ch1 = (char)result;
		System.out.println(ch1);// f
	}
}
