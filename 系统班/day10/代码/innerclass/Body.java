package com.ujiuye.innerclass;

public class Body {// �ⲿ��
	// blood������ʾѪѹ
	// private��ǰ����ʹ��, ����Body֮������������в���ֱ�ӷ���
	int blood = 120;
	
	// ��ͨ��Ա�ڲ���
	class Heart{// ����, ����һ����Ա����
		int jump = 80;
		
		public void show() {
			System.out.println("ѪѹΪ" + blood + ",����Ϊ:" + jump);
		}
	}
	
	// �����һ���������� : ʹ����ͨ��Ա�ڲ���Heart������
	public void useHeart() {
		System.out.println(blood);// 120
		Heart h = new Heart();
		System.out.println(h.jump);// 80
		h.show();
	}

}
