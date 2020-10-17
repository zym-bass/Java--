package com.ujiuye.fordemo;

public class Demo06_死循环 {

	public static void main(String[] args) {
		 /*int i = 0;
         while(true) {
        	 System.out.println(i);
        	 i++;
         }*/
		
		for(; ;) {
			System.out.println("abc");
		}
		// System.out.println(123); 死循环之后代码因为永远无法执行, 因此系统报错提示
	}
}
