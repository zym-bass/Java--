package com.ujiuye.object;

public class TestStudent {

	public static void main(String[] args) {
      // 1. ������һ��Student���Ͷ���
	  Student s = new Student();
	  s.name = "������";
	  s.classNo = "3��2��";
	  s.id = "001";
	  // �뷨 : ����ֱ�Ӹ�age���и�ֵ, ���ðѿظ�ֵ�Ƿ���ȷ, ����ʹ��private˽������age
	  // The field Student.age is not visible
	  // s.age = 10; 
	  s.setAge(10);
	  System.out.println(s.getAge());
	}
}
