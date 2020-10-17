package com.ujiuye.cal;

public class Demo02 {


	public static void main(String[] args) {
		int i = 10;
		// 1) i + 5 = 15 2) i = 15 类似于 : i = i + 5;
		i += 5;
		System.out.println(i);// 15
		
		// 1) i % 6 = 15 / 6 = 2...3 结果为3
		// 2) i = 3; 
		i %= 6;
		System.out.println(i);// 3
		
		/*short s = 5;
		s = s + 1;*/
		
		short ss = 5;
		// ss = (short)(ss + 1);
		ss += 1;
		System.out.println(ss);// 6
		
		int i2 = 15;
		// i2 + 6.2 = 15 + 6.2 = 21.2(double)
		// i2 = (int)(i2 + 6.2);
		i2 += 6.2;
		System.out.println(i2);// 21
	}
}
