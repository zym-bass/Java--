package com.ujiuye.finaldemo;

public class FinalMethodZi extends FinalMethod {
   // 继承到了父类中的两个方法 : fun() ; play();
   // fun可以重写, play不能重写
	@Override
	public void fun() {
		System.out.println("我是子类重写fun");
	}
	
	// Cannot override the final method from FinalMethod
	// 无法重写使用final修饰方法
	/*public void play() {
		System.out.println("父类中的final最终方法, 可以继承, 不能重写");
	}*/
}
