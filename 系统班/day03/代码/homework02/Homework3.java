package com.ujiuye.homework02;

public class Homework3 {

	public static void main(String[] args) {
		short s1 = 1; 
		//Type mismatch: cannot convert from int to short
		// 1) s1与int类型数据1进行加法运行, 于是short类型的变量s1需要自动提升类型为int
		// 2) 1 + 1 = 2(int类型)
		// 3) int类型大于short类型的, 大类型不能直接给小数据类型直接赋值
		s1 = (short)(s1 + 1);
	}
}
