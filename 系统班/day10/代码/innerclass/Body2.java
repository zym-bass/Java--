package com.ujiuye.innerclass;

public class Body2 {// �ⲿ��
	int day = 1;
	
	static class Shen{
		static int drink = 2;
		int wc = 5;
		
		public void show() {
			// 1. ��̬��Ա�ڲ�����, ����ֱ��ʹ���ⲿ���зǾ�̬��Ա, �����ȴ�����һ���ⲿ�����
			// ʹ�ö�����.����
			Body2 b2 = new Body2();
			System.out.println(b2.day + "��,����" + drink + "��ˮ,��Ҫȥ������" + wc+"��");
		}
	}

}
