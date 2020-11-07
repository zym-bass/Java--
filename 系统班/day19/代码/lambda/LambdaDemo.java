package com.ujiuye.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
          // 1. 使用匿名内部类对象实现InterfaceDemo接口
		  new InterfaceDemo() {
			@Override
			public void fun() {
				System.out.println("匿名内部类对象实现接口");
			}
		  }.fun();
		  
		  // 2. Lambda表达式实现InterfaceDemo函数式接口, 语法结构
		  // (参数列表)->{方法体/Lambda体};
		  // 接口多态性
		  InterfaceDemo id = ()->{
			  System.out.println("Lambda表达式实现接口");
		  };
		  id.fun();
		  
		  // 3. Lambda表达式实现方法只有1个参数情况
		  InterfaceDemo2 id2 = (x)->{
			  for(int i = 0; i <= x; i++) {
				  System.out.println(i);
			  }
		  };
		  id2.print(5);
		  
		  System.out.println("------------");
		  
		  //4. Lambda表达式实现方法只有1个参数, 小括号可以省略
		  InterfaceDemo2 id3 = x->{
			  for(int i = 0; i <= x; i++) {
				  System.out.println(i);
			  }
		  };
		  id3.print(3);
		  
		  // Lambda表达式方法体只有一句, 大括号可以省略
		  InterfaceDemo3 id4 = (a,b)->System.out.println(a==b);
		  id4.equal(3.14, 3.14);// true
		  
		  // 5. Lambda表达式实现的方法有返回值类型, 与普通方法一样, 需要return
		  InterfaceDemo4 id5 = (x,y)->{
			  return x + y;
		  };
		  
		  System.out.println(id5.getSum(5, 6));// 11.0
		  
		  // 6. 如果Lambda体只有一句代码,且这一句正好是返回值结果, return和大括号可以同时省略
		  InterfaceDemo4 id6 = (x,y)->x + y;
		  System.out.println(id6.getSum(6.6, 7.2));// 13.8
	}
}

@FunctionalInterface
interface InterfaceDemo{
	public abstract void fun();
}


@FunctionalInterface
interface InterfaceDemo2{
	public abstract void print(int n);
}


@FunctionalInterface
interface InterfaceDemo3{
	public abstract void equal(double x, double y);
}

@FunctionalInterface
interface InterfaceDemo4{
	public abstract double getSum(double x, double y);
}