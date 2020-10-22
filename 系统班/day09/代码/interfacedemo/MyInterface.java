package com.ujiuye.interfacedemo;

public interface MyInterface {
    // 在接口中定义出抽象方法
	// 修饰符 abstract 返回值类型 方法名(参数列表);
	public abstract void eat();
	
	public abstract boolean equal(double x, double y);
	
	//Abstract methods do not specify a body
	/*public void eat2() {
		
	}*/
}
