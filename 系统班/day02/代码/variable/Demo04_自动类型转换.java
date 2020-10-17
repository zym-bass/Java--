package com.ujiuye.variable;

public class Demo04_自动类型转换 {

	public static void main(String[] args) {
		// 1. 小数据类型直接转换成大数据类型
		byte b = 15;
		int i = b;
		
		// 2. 小数据类型与大数据类型进行运算, 小类型数据自动提升类型为大类型, 计算结果与大数据类型为准
		short s = 15;
		//Type mismatch: cannot convert from int to short
		//short ss = s + 1;
		
		int ss = s + 1;
		System.out.println(ss);// 16
		System.out.println(i);// 15
		
		double d = ss;
		System.out.println(d);// 16.0
		
		//byte, short, char, int类型数据,自身或者彼此之间进行运算, 统统默认提升类型为int, 如果运算过程中, 有大于int类型的数据, 那么以最大类型数据为提升标准
        byte b1 = 88;
        short s1 = 99;
        //Type mismatch: cannot convert from int to short
        //short re = b1 + s1;
        int re = b1 + s1;
        System.out.println(re);// 187
	}

}
