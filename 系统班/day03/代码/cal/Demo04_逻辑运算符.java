package com.ujiuye.cal;

public class Demo04_逻辑运算符 {

	public static void main(String[] args) {
       int i = 12;
       boolean boo = i >= 5 && i <= 10;
       System.out.println(boo);// false
       
       boolean boo1 = i >= 5 || i <= 10;
       System.out.println(boo1);// true
       
       System.out.println(!true);//false
       System.out.println(!boo);// true
       
       System.out.println("----------------");
       
       // && 运算高效原理
       // 因为第一个条件 i <= 10 为false , 因此第二个表达式条件 ++i >= 10 根本没有计算和比较
       // 直接返回false结果
       boolean boo2 = i <= 10 && ++i >= 10;
       System.out.println(boo2);// false
       System.out.println(i);// 12
       
       // ||运算高效原理
       // 第一个条件表达式 true , 第二个表达式, 不需要运算个比较, 直接返回true结果
       boolean boo3 = i >= 5 || --i >= 5;
       System.out.println(boo3);// true
       System.out.println(i);// 12
	}
}
