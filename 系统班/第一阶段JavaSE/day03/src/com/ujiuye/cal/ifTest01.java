package com.ujiuye.cal;

public class ifTest01 {
	public static void main(String[] args) {
		// ���� : ĳ��˾����Ҫ��Ա������н�ʵ���, ����������ڵ���5��, 
		// ��н3000Ԫ, ���䲻��5���, û�м�н

		// workAge��ʾԱ���Ĺ���
		int workAge = 14;
		// salary��ʾԱ����������
		double salary = 5000;
		// ���������ڵ���5��, ��н
		if(workAge >= 5) {
		salary += 3000;// salary = salary + 3000;
		}

		System.out.println("Ա��������" + workAge + "��,Ŀǰн��Ϊ" + salary);
		}

}
