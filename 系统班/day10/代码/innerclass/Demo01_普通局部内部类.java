package com.ujiuye.innerclass;

public class Demo01_��ͨ�ֲ��ڲ��� {

	public static void main(String[] args) {
		breath();
	}
	
	// �����һ������
	public static void breath() {
		// �ֲ������޷�������ȡ��
		int day = 2;
		class Fei{// �ֲ��ڲ���, ����һ���ֲ�����
			int smoke = 50;
			String color = "��ɫ";
			public void show() {
				System.out.println(day+"��,ÿ�춼��" + smoke + "�����,�����Ժ�ξͻ���" + color);
			}
		}
		// ����һ���ֲ��ڲ���֮��, ���ϴ�����һ���ֲ��ڲ������ʹ��
		Fei f = new Fei();
		System.out.println(f.color);
		System.out.println(f.smoke);
		f.show();
	}

}
