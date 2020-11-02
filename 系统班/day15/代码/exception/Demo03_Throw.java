package com.ujiuye.exception;

public class Demo03_Throw {

	public static void main(String[] args) {
		// int[] arr = {1,2,3,4};
		int[] arr = null;
		getArrayEle(arr,6);
	}
	
	// �����һ������ : ��int[]������ִ������λ��Ԫ�صĽ��
	public static void getArrayEle(int[] arr, int index) {
		
		// 1. �ṩ��������arr����Ϊnull
		if(arr == null) {// ���Ϸ�ʵ���������
			throw new NullPointerException("���鲻��Ϊnull");
		}
		
		// 2.�ṩindex����λ����Ҫ��arr�����д���
		if(index < 0 || index > arr.length-1) {
			throw new ArrayIndexOutOfBoundsException(index + "����������arr�в�����");
		}
		
		int ele = arr[index];
		System.out.println(ele);
	}
}
