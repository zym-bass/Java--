package com.ujiuye.cal;

public class ifTest02 {

public static void main(String[] args) {
	// ���� : ĳ��˾����Ҫ��Ա������н�ʵ���, ����������ڵ���5��, 
	// ��н3000Ԫ, ���䲻��5���, ��н1000Ԫ
	
	// workAge��ʾԱ������
	int workAge = 5;
	// salary��ʾԱ����������
	double salary = 4688.88;
	// ����Ա�������ж�Ա����н�ļ���
	if(workAge >= 5) {
	salary += 3000;
	}else {
	salary += 1000;
	}
	System.out.println("Ա��������" + workAge + "��,Ŀǰн��Ϊ" + salary);
	}

}
