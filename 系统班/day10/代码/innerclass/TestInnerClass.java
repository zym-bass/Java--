package com.ujiuye.innerclass;

public class TestInnerClass {

	public static void main(String[] args) {
		// 1. ��ͨ��Ա�ڲ������
		Body b = new Body();
		b.useHeart();
		// ���ʳ�Ա����
		System.out.println(b.blood);
		System.out.println("------------");
		
		// 3)��ͨ��Ա�ڲ����ڳ����ⲿ������������� : ���÷�ʽΪ
		//  �ⲿ��.�ڲ��� �ڲ������ = new �ⲿ��().new �ڲ������();
		Body.Heart h1 = new Body().new Heart();
		System.out.println(h1.jump);
		h1.show();
		
		// 2. ˽�г�Ա�ڲ������
		Body1 b1 = new Body1();
		b1.useGan();
		
		System.out.println("------");
		
		// 3. ��̬��Ա�ڲ������
		System.out.println(Body2.Shen.drink);// 2
		// ������һ����̬��Ա�ڲ������
		Body2.Shen b2 = new Body2.Shen();
		System.out.println(b2.wc);// 5
		b2.show();// 1��,����2��ˮ,��Ҫȥ������5��
	}
}
