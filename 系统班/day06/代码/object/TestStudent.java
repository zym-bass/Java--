package com.ujiuye.object;

public class TestStudent {

	public static void main(String[] args) {
      // 1. 创建出一个Student类型对象
	  Student s = new Student();
	  s.name = "大美丽";
	  s.classNo = "3年2班";
	  s.id = "001";
	  // 想法 : 不想直接给age进行赋值, 不好把控赋值是否正确, 可以使用private私有修饰age
	  // The field Student.age is not visible
	  // s.age = 10; 
	  s.setAge(10);
	  System.out.println(s.getAge());
	}
}
