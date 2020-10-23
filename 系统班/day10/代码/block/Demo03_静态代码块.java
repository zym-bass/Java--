package com.ujiuye.block;

public class Demo03_静态代码块 {
	int i;
	static String schoolName;
	// 定义出静态代码块
    static {
    	schoolName = "第一中学";
    	// i = 88;
    	System.out.println("静态代码块执行了");// 1.静态代码块执行了
    }
    // 构造代码块
    {
    	i = 10;
    	System.out.println("我是构造代码块" + i);// 3. 我是构造代码块10  // 5
    }
    
    public Demo03_静态代码块() {
    	System.out.println("我是构造方法");// 4. 我是构造方法  // 6
    }
    
    public static void main(String[] args) {
    	System.out.println(Demo03_静态代码块.schoolName);// 2. 第一中学
    	Demo03_静态代码块 demo = new Demo03_静态代码块();
    	Demo03_静态代码块 demo1 = new Demo03_静态代码块();
	}
}
