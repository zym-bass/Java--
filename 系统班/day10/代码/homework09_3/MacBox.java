package com.ujiuye.homework09_3;

public class MacBox {
	
	// ������ʼǱ���������
	public void openBox() {
		System.out.println("�ʼǱ�����");
	}
	
	// ������ʼǱ��ػ�����
	public void closeBox() {
		System.out.println("�ʼǱ��ػ�");
	}
	
	// �����һ��ʹ��USB�Ĺ���
	// USB u = new Mouse(); // �ӿڵĶ�̬��
	// u.���÷���ȫ�����ǵȺ��ұ�Mouse����д����
	// USB u1 = new KeyBoard();
	// u1.���÷���ȫ�����ǵȺ��ұ�KeyBoard����д����
	public void useUSB(USB u) {// ���̿���ʹ��USB / ���Ҳ����ʹ��USB...δ�������кܶ��豸ʹ��USB
		u.openUSB();
		u.closeUSB();
	}
}
