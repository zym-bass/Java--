package com.ujiuye.cal;

public class ifTest04 {
	public static void main(String[] args) {
		// workAge��ʾԱ������
		int workAge = 3;
		// salary��ʾԱ����������
		double salary = 4688.88;
		if(workAge < 0) {
		System.out.println("��������,�޷�����н�ʵ���");
		}else if(workAge < 5) {
		salary += 2000;
		}else if(workAge < 10) {
		salary += 3000;
		}else if(workAge < 15) {
		salary += 4000;
		}else if(workAge >= 15){
		salary += 5000;
		}

		System.out.println("Ա��������" + workAge + "��,Ŀǰн��Ϊ" + salary);
		}

}
