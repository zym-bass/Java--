package com.ujiuye.homework07;

public class Homework02 {
	public static void main(String[] args) {
		/*
		 *   1. 创建一个Foo类型对象, Foo类型.class字节码文件进入到方法区中, 静态成员加载进内存中,
		 *    静态成员变量有值
		 *   2. 调用空参数构造方法, 使用i的原值给id先赋值, 赋值结束, i++
		 */
		Foo f1 = new Foo();// id = 0; i = 1;
		Foo f2 = new Foo();// id = 1; i = 2;
		Foo f3 = new Foo();// id = 2; i = 3;
		                   //  0            1                2               3
		System.out.println(f1.id + "---" + f2.id + "---" + f3.id + "----" + Foo.i);
	}
}


class Foo{
	int id;
	static int i = 0;
	public Foo() {
		id = i++;
    }
}
