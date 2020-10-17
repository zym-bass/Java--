package com.ujiuye.function;

public class Demo01_方法定义和使用 {
	      /*  // 调用方法(使用方法): 需要传递实际参数值
			// 1. 直接调用, print方法没有返回值类型
			print(6);
			// 2. 输出调用
			System.out.println(getSum(3,5));// 8
			// 3. 赋值调用
			boolean boo = equal(3.14,3.14);
			System.out.println(boo);// true
*/	public static void main(String[] args) {
	     int re = getSum(3,5);
	     System.out.println(re);
	}
	/*修饰符 返回值类型 方法名(参数列表){
	               方法体;
	       return 语句;
	}*/
	// 需求1 : 定义出一个方法功能, 求任何两个整数的和
	//This method must return a result of type int
	public static int getSum(int x, int y) {
		int w = x + y;
		return w;
	}
	
	// 需求2 : 定义出一个方法功能, 比较两个浮点类型数据是否相等
	public static boolean equal(double x, double y) {
		boolean boo = x == y;
		return boo;
	}
	
	// 需求3 : 定义出一个方法功能, 打印1-n整数(1-n任意整数打印, n为正整数)
	public static void print(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		// return;
	}	
}
