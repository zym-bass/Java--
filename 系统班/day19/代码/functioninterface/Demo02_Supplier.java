package com.ujiuye.functioninterface;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Demo02_Supplier {

	public static void main(String[] args) {
		//�ͻ�1 : �洢5������, ������30-80֮�������� 
		// (0-50) + 30
		Supplier<Integer> sup = ()->new Random().nextInt(51) + 30;
		ArrayList<Integer> list1 = testSupplier(5,sup);
		System.out.println(list1);
		
		//�ͻ�2 : �洢8������, ������1-100֮������ż��
		Supplier<Integer> sup1 = ()->{
			Random ran = new Random();
			int number = ran.nextInt(100) + 1;
			while(true) {
				if(number % 2 == 0) {
					break;
				}else {
					number = ran.nextInt(100) + 1;
				}
			}
			return number;
		};
		System.out.println(testSupplier(8,sup1));
	}
	/*���� : �����һ����������, �����ܸ��ͻ�����һ��ArrayList<Integer>����, 
	 * ���ص������а�����������, �����д洢��������ʲô����, ���ݿͻ���ʵ��Ҫ�����
	�ͻ�1 : �洢5������, ������30-80֮��������
	�ͻ�2 : �洢8������, ������1-100֮������ż��
	...
	ÿһ���ͻ�����Ҫ�õ����������ļ�������
	
	*
	*  ���� :
	*    1) ��һ������ : ��Ҫ�����д洢�����ݸ���  int count
	*    2) �ڶ������� : ��Ҫ���������д洢�����ݻ�ȡ����, ���Խ�Supplier��Ϊ�����Ĳ�������,
	*    �൱�ڴ���T get()
	*/
	public static ArrayList<Integer> testSupplier(int count, Supplier<Integer> sup){
		ArrayList<Integer> list = new ArrayList<>();
		// ��list���������Ԫ������
		for(int i = 1; i <= count ; i ++) {
			// ����ҪInteger��������, �������Integer�������ݵĻ�ȡ��ʽû��ȷ��
			list.add(sup.get());
		}
		return list;
	}
}
