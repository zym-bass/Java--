package com.ujiuye.extendsDemo;

public class Test继承的使用细节 {
	public static void main(String[] args) {
        Son s = new Son();
        // 1. 测试子父类继承中成员变量
        System.out.println(s.i + "---" 
          + s.my + "---" + s.w);// 10, 88, 99 
        
        // 2. 测试子父类继承中方法功能
        s.eat();// 调用子类重写方法功能
        s.sleep();// 调用从父类继承来的方法
        s.useI(); // 调用子类的特有方法
	}
}
