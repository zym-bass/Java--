package com.ujiuye.object;

public class TestCar {
	public static void main(String[] args) {
         // 1. ������һ����������
		 Car c = new Car();
		 System.out.println(c);
		 c.color = "��";
		 c.num = 4;
		 c.run();
		 
		 // 2. ����������һ����������
		 Car c1 = new Car();
		 System.out.println(c1);
		 c1.color = "����ɫ";
		 c1.num = 8;
		 c1.run();
		 
		 // 3. ����car���͵Ķ�������ָ��ͬһ���ڴ�ռ�
		 Car c2 = c1;
		 System.out.println(c2.num);// 8
		 
		 
		 Car c3 = new Car();
		 System.out.println(c3.num);// 0
		 System.out.println(c3.color);// null
		 
	}
}
