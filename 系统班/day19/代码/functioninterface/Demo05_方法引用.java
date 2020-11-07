package com.ujiuye.functioninterface;

public class Demo05_方法引用 {

	public static void main(String[] args) {
         // Lambda表达式实现:
		InterDemo id = x->System.out.println(x);
		id.print(5);// 5
		
		// System系统类中静态成员常量out, 调用返回PrintStream(打印流)对象, 对象名.调用println方法功能
		// 做标准数据输出
		// 方法引用实现InterDemo接口
		InterDemo id1 = System.out :: println;
		id1.print(99);// 99
		
		// 方法引用实现InterDemo2接口
		InterDemo2 id2 = x->System.out.println(Integer.parseInt(x) + 1);
		// 对象引用
		InterDemo2 id3 = new NumberPrint() :: print;
		id3.print("125");// 126
		
		// 类型引用
		InterDemo2 id4 = NumberPrint2 :: print;
		id4.print("88");// 93
	}
}

class NumberPrint{
	public void print(String x) {
		System.out.println(Integer.parseInt(x) + 1);
	}
}

class NumberPrint2{
	public static void print(String x) {
		System.out.println(Integer.parseInt(x) + 5);
	}
}

@FunctionalInterface
interface InterDemo{
	public abstract void print(int x);
}

@FunctionalInterface
interface InterDemo2{
	public abstract void print(String x);
}
