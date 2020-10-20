package com.ujiuye.staticdemo;

public class Demo01_静态使用注意事项 {
    // 定义出一个成员变量
	static int i = 10;
	int j = 20;
	
	public static void main(String[] args) {
		 // 1. Cannot make a static reference to the non-static field i
		 // 静态方法中不能直接使用非静态成员变量
		 /*
		  *  分析 : 
		  *  当类加载机进入到内存中时, 静态成员变量有值可以使用; 静态方法也可以直接调用
		  *    堆内存中, 没有任何对象出生; 非静态成员变量跟着对象创建才出现在内存中有值
		 */
         System.out.println(i);// 10
         
         // 2. 如果使用非静态成员变量, 也可以先创建对象, 使用对象名.调用
         System.out.println(new Demo01_静态使用注意事项().j);
        
         // 3. 静态方法中可以直接调用其他静态方法
         eat();
        
         // 4. 静态方法中不能直接调用非静态方法, 创建对象之后,可以调用
         //Cannot make a static reference to the non-static method sleep()
         // from the type Demo01_静态使用注意事项
         new Demo01_静态使用注意事项().sleep();
         
         // 5. 因为this表示对象引用, 静态优先于对象存在于内存中, 直接使用this
         // Cannot use this in a static context
         // System.out.println(this.j);
         
         Demo01_静态使用注意事项.eat();
	}
	
	public static void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
}
