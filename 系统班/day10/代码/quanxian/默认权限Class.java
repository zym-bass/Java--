package com.ujiuye.quanxian;

// 类就是一个默认权限的类
class 默认权限Class {
   // 成员变量i也是默认权限
   int i = 10;
   
   public static void main(String[] args) {
	     System.out.println(new 默认权限Class().i);
   }
}
