package com.ujiuye.cal;

public class Demo01 {


	public static void main(String[] args) {
	// 1. ++或者--作用在某个变量之上, 这个变量就是一个独立语句, 变量不参与其他运算
	int a = 10;
	a++;
	System.out.println(a);// 11
	++a;
	System.out.println(a);// 12

	int b = 5;
	b--;
	System.out.println(b);// 4
	--b;
	System.out.println(b);// 3

	// 2. ++作用在变量之前, 且变量参与运算, 先进行变量自增运算, 然后参与其他数据运算
	// 运算过程 : 1) ++a a = 13 2) a + b = 13 + 3 = 16
	int w = ++a + b;
	System.out.println(w);// 16
	System.out.println(a);// 13

	// --作用在变量之后, 且变量参与运算, 先使用变量a原值参与运算, 再进行a值--操作
	// 运算过程 : 1) 13 + 3 = 16(赋值给y) 2) a-- a = 12
	int y = a-- + b;
	System.out.println(y);// 16
	System.out.println(a);// 12

	System.out.println("---------------");

	// a = 12 b = 3
	// 1) 12 + 3 = 15(赋值result) 2) a++ a = 13
	int result = a++ + b;// a++ + b;
	System.out.println(result);// 15
	System.out.println(a);// 13
	System.out.println(b);// 3
	}

}
