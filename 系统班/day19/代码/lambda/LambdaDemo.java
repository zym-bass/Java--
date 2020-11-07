package com.ujiuye.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
          // 1. ʹ�������ڲ������ʵ��InterfaceDemo�ӿ�
		  new InterfaceDemo() {
			@Override
			public void fun() {
				System.out.println("�����ڲ������ʵ�ֽӿ�");
			}
		  }.fun();
		  
		  // 2. Lambda���ʽʵ��InterfaceDemo����ʽ�ӿ�, �﷨�ṹ
		  // (�����б�)->{������/Lambda��};
		  // �ӿڶ�̬��
		  InterfaceDemo id = ()->{
			  System.out.println("Lambda���ʽʵ�ֽӿ�");
		  };
		  id.fun();
		  
		  // 3. Lambda���ʽʵ�ַ���ֻ��1���������
		  InterfaceDemo2 id2 = (x)->{
			  for(int i = 0; i <= x; i++) {
				  System.out.println(i);
			  }
		  };
		  id2.print(5);
		  
		  System.out.println("------------");
		  
		  //4. Lambda���ʽʵ�ַ���ֻ��1������, С���ſ���ʡ��
		  InterfaceDemo2 id3 = x->{
			  for(int i = 0; i <= x; i++) {
				  System.out.println(i);
			  }
		  };
		  id3.print(3);
		  
		  // Lambda���ʽ������ֻ��һ��, �����ſ���ʡ��
		  InterfaceDemo3 id4 = (a,b)->System.out.println(a==b);
		  id4.equal(3.14, 3.14);// true
		  
		  // 5. Lambda���ʽʵ�ֵķ����з���ֵ����, ����ͨ����һ��, ��Ҫreturn
		  InterfaceDemo4 id5 = (x,y)->{
			  return x + y;
		  };
		  
		  System.out.println(id5.getSum(5, 6));// 11.0
		  
		  // 6. ���Lambda��ֻ��һ�����,����һ�������Ƿ���ֵ���, return�ʹ����ſ���ͬʱʡ��
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