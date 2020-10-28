package com.ujiuye.integer;

public class Demo04_自动拆装箱 {

	public static void main(String[] args) {
         // 1.自动装箱
		 Integer i = 10;
		 
		 // 2. 自动拆箱
		 int num = i;
		 
		 // 分析:
		 // 1) i对应的Integer类型数据, 进行自动拆箱, 变成int类型  10 + 5 = 15---> int
		 // 2) 将1)中计算出的结果int类型的15, 赋值给引用类型i , 自动装箱
		 i = i + 5;
		 
		 
	}
}
