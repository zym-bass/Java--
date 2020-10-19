package com.ujiuye.object;

public class TestCar {
	public static void main(String[] args) {
         // 1. 创建出一个汽车对象
		 Car c = new Car();
		 System.out.println(c);
		 c.color = "红";
		 c.num = 4;
		 c.run();
		 
		 // 2. 创建出另外一个汽车对象
		 Car c1 = new Car();
		 System.out.println(c1);
		 c1.color = "军绿色";
		 c1.num = 8;
		 c1.run();
		 
		 // 3. 两个car类型的对象引用指向同一块内存空间
		 Car c2 = c1;
		 System.out.println(c2.num);// 8
		 
		 
		 Car c3 = new Car();
		 System.out.println(c3.num);// 0
		 System.out.println(c3.color);// null
		 
	}
}
