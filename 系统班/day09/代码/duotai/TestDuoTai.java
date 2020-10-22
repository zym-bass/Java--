package com.ujiuye.duotai;

public class TestDuoTai {

	public static void main(String[] args) {
		Teacher t1 = (Teacher)new Person();
		// 多态表达式
		Person p = new Teacher();
		p.eat();//教师今天想吃凉皮
		//The method teach() is undefined for the type Person
		// 1.编译看左, 左边Person类型中没有定义出teach方法, 因此编译环节报错
		// p.teach();
		// 3. 多态向下转型 : 为了将父类引用p,回复成子类Teacher类型本身, 如此可以使用子类中特有方法
		Teacher t = (Teacher)p;
		t.eat();
		t.teach();// 教师可以讲课
		
		// 多态表达式
		Person p1 = new Doctor();
		// 2.运行看右 , 运行的是等号右边子类中的重写方法
		p1.eat();//医生吃的很清淡,养生
		
		Doctor d = (Doctor)p1;
		d.savePerson();// 医生可以治病救人
	}
}
