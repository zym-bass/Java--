package com.ujiuye.extendslx;

public class Test {

	public static void main(String[] args) {
        // 1. ����Ա��
		Program p = new Program();
		p.setName("С��");
		p.setAge(20);
		p.setId("001");
		p.setSalary(12000);
		
		p.work();
		
		// 2. ��Ŀ������ : ��Ҫͨ�����췽����ֵ
		Manager m = new Manager("Сǿ", 25, "jl001", 13000, 3000);
		m.work();
		
		// 3. ����Ա��ʹ�ù��츳ֵ
		Program p1 = new Program("����", 22, "002", 10000);
		p1.work();
	}
}
