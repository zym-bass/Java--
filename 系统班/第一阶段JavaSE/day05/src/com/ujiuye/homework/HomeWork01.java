package com.ujiuye.homework;
//���������
import java.util.Random;
public class HomeWork01 {
	public static void main(String[]  args) {
		
		//�������������
		Random s = new Random();
		String[] student ={"һ","��","��","��","��","��","��","��","��","ʮ"};
		/*//��������һ
		for(int i = 0 ;i<student.length  ; i++) {
			System.out.println(student[i]);
		}*/
		//���������� 
		for(String stu :student) {
			System.out.print(stu+"\t");
		}
		System.out.println("\n���㵽��ѧ���ǣ�"+student[s.nextInt(10)]);
	}
	
}
