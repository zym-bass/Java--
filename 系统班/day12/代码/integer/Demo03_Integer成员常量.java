package com.ujiuye.integer;

public class Demo03_Integer成员常量 {

	public static void main(String[] args) {
		
       System.out.println(Integer.MAX_VALUE);// 2147483647
       System.out.println(Integer.MIN_VALUE);// -2147483648
       
       // int类型在内存中占有4字节, 1字节就是8个连续比特位(1个比特位就是1个2进制位)
       System.out.println(Integer.SIZE);// 32
       
       System.out.println(Integer.TYPE);// int
	}

}
