package com.ujiuye.cal;

public class Demo03_比较运算符 {

	public static void main(String[] args) {
        int i = 10;
        int j = 20;
        boolean boo = i == j;
        System.out.println(boo);// false
        
        boolean boo1 = i != j;
        System.out.println(boo1);// true
        
        System.out.println(i >= j);// false
        
        // 定义出一个整数变量i , 判断i是不是5到10之间的整数(分析 : 验证i值大于等于5同时小于等于10数据范围即可)
        //The operator <= is undefined for the argument type(s) boolean, int
        // 运算符 <= 没有定义过 boolean类型与int类型之间比较方式
        // 1) 5 <= i  true
        // 2) true <= 10
        // boolean boo2 = 5 <= i <= 10;
	}

}
