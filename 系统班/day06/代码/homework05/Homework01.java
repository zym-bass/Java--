package com.ujiuye.homework05;

import java.util.Random;
public class Homework01 {
	/*1. �����������󣬲��ô���ʵ�֣�
         ���������
	����ȫ��ͬѧ��(��10��)����Ĵ�ӡ��һ��ͬѧ����
	Ҫ������������������߱�����3�����ݣ�
                1. �Լ�����10��ѧ��������,����ͬѧ�������д洢
                2. ����ȫ��ͬѧ������,��ÿλѧ��������ӡ�ڿ���̨��
                3. ��10����,�������,��������ͬѧ������ӡ������̨��*/
	public static void main(String[] args) {
        // 1.�����һ��nameArr��������, ���ڴ洢10��ѧ������
		String[] nameArr = {"��1","��2","��3","��4","��5","��6","��7","��8","��9","��10"};
		// 2. ����nameArr����
		for(int index = 0; index < nameArr.length; index++) {
			String name = nameArr[index];
			System.out.print(name + "  ");
		}
		System.out.println();
		// 3. 10��ѧ����Ӧ��������� 0-9, ��Ҫ����0-9֮���һ�����������
		Random ran = new Random();
		// 4. number��ʾ���������
		int number = ran.nextInt(10);
		// 5. ��ȡ����������ͬѧ����
		String endName = nameArr[number];
		
		System.out.println("Ŀǰ������" + (number + 1) + "��ͬѧ,����Ϊ: " + endName);
	}
}
