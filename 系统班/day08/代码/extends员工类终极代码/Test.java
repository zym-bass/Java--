package com.ujiuye.extendslx;

public class Test {

	public static void main(String[] args) {
        // 1. 程序员类
		Program p = new Program();
		p.setName("小明");
		p.setAge(20);
		p.setId("001");
		p.setSalary(12000);
		
		p.work();
		
		// 2. 项目经理类 : 想要通过构造方法赋值
		Manager m = new Manager("小强", 25, "jl001", 13000, 3000);
		m.work();
		
		// 3. 程序员类使用构造赋值
		Program p1 = new Program("美丽", 22, "002", 10000);
		p1.work();
	}
}
