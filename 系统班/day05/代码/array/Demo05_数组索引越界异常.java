package com.ujiuye.array;

public class Demo05_��������Խ���쳣 {

	public static void main(String[] args) {
         int[] arr = {12,13,0,99,88,-7};// Ԫ����6��, ������Χ0-5
         //ArrayIndexOutOfBoundsException
         //����    ����   ����    �߽�     �쳣
         //arr[-1] = 72;
         
         // arr[6] = 99; Խ��
         System.out.println(arr.length);// 6
         
         int ele = getArrayElement(arr,5);
         System.out.println(ele);// -7
	}
	
	// �����һ���������� : ��ȡ��ָ��int[]��ĳһ������λ��Ԫ��ֵ
	public static int getArrayElement(int[] arr, int index) {
		// �ж�: ʹ��index������arr�д��ڲ���ʹ��
		// index >= 0  index <= 5
		// index >= 0  index < 6
		if(index >= 0 && index < arr.length) {
			return arr[index];
		}else {
			System.out.println(index + "��������arr������ȷ������Χ֮��, �޷�����, ����Ĭ��ֵΪ0");
			return 0;
		}
		
	}

}
