package com.ujiuye.object;

public class Demo02_VariableUse {
    // ��Ա���� : ���Ŷ���洢�ڶ��ڴ���
	int i = 10;
	
	public void useI() {
		// �ֲ����� : ����useI�����洢��ջ�ڴ���
		int i = 20;
		// 1. iֵ����Ǿֲ�����20, ���ֳ������ͽ�����ԭ��
		System.out.println(i);// 20
		// 2. ���� : �������Ҫ��useI�����е��ó�Ա����i
		// ���� : ˼��,���콲���еĳ�Ա�����ͷ�������
		System.out.println(new Demo02_VariableUse().i);// 10
		// 3. ����һ�ֵ��ó�Ա����i��ʽ : this�ؼ���
		System.out.println(this.i);// 10
		System.out.println("this---" + this);
	}
	
	public static void main(String[] args) {
		Demo02_VariableUse demo2 = new Demo02_VariableUse();
		System.out.println("demo2-----"+demo2);
		demo2.useI();
		System.out.println("-------------");
		
		Demo02_VariableUse demo3 = new Demo02_VariableUse();
		System.out.println("demo3----"+demo3);
		demo3.useI();
	}
}
