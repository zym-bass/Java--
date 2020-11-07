package com.ujiuye.interfaceJDK8;

public class TestInterface {

	public static void main(String[] args) {
      // 1. 测试实现类可以直接调用父接口中的默认功能
		InterfaceJDK8Impl impl = new InterfaceJDK8Impl();
		impl.eat();
		impl.sleep();
		impl.fun();
		
		// 2. 测试实现类与父接口中静态方法之间的使用
		//InterStaticImpl实现类没有继承到父接口中的静态方法
		// InterStaticImpl.function();
		MyInterStaticMethod.function();
	}
}
