package com.ujiuye.innerclass;

public class Body1 {// �ⲿ��
	// drink��ʾ�ȾƵĽ���
	private int drink = 5;
	
	private class Gan{// ˽�г�Ա�ڲ���, ������һ��˽�г�Ա����
		String color = "black";
		
		public void show() {
			System.out.println("ÿ�춼Ҫ��" + drink + "��׾�,�ٺȵ�,��Ȼ�Ժ�ξ�Ҫ���" + color);
		}
	}
	
	// �����ṩʹ��˽�г�Ա�ڲ���Gan��������
	public void useGan() {
		// ������һ��˽�г�Ա�ڲ������
		Gan gan = new Gan();
		System.out.println(gan.color);
		gan.show();
	}
}
