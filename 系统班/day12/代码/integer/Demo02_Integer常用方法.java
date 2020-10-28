package com.ujiuye.integer;

public class Demo02_Integer常用方法 {

	public static void main(String[] args) {
         Integer i = new Integer(26);
         // 1. byteValue() : 将Integer类型所所表示的数据转换成基本数据类型byte
         byte b = i.byteValue();
         System.out.println(b);
         
         // 2. static parseInt(String s): 将字符串s表示的数值转换成int类型整数 
         int num = Integer.parseInt("-99");
         System.out.println(num + 1);
         
         // 3. 将int类型转换成String类型     -99 + ""
         String s = String.valueOf(-99);
         System.out.println(s + 1);// -991
         
         // 4. 十进制转换成其他进制
         System.out.println(Integer.toBinaryString(5));// 101
         System.out.println(Integer.toOctalString(10));// 12
         System.out.println(Integer.toHexString(26));//1a      
	}
}
