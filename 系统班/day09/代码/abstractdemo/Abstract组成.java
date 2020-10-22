package com.ujiuye.abstractdemo;

public abstract class Abstract组成 {
	// 1. 可以定义出成员变量
    int i = 10;
    static final int I = 20;
    private String name = "张三";
    
    // 2. 可以定义出非抽象方法
    public void fun() {
    	System.out.println("-------");
    }
    
    public static void fun2() {
    	System.out.println("++++++++++++");
    }
    
    // 3. 抽象方法
    public abstract int getSum(int x, int y);
    
    // 4. 可以定义出构造方法
    public Abstract组成() {
    	System.out.println("我是抽象父类的空参数构造");
    }
}
