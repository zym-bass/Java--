package com.ujiuye.array;

public class Demo02_�����ʼ�� {

	public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);//[I@15db9742
        // 1. ��������Ԫ�ؽ��ж�̬��ֵ
        arr[0] = 15;
        arr[1] = 99;
        // arr[2] = -7;
        
        // 2. ��ȡ������Ԫ��ֵ
        int first = arr[0];
        
        System.out.println(first);// 15
        System.out.println(arr[1]);// 99
        System.out.println(arr[2]);// 0
        
        double[] arr1 = new double[5];
        System.out.println(arr1[2]);// 0.0
        
        String[] arr2 = new String[2];
        System.out.println(arr2[0]);// null
        
        // 3. ���龲̬��ʼ��
        int[] arr3 = new int[] {12,13,6,-7};
        int[] arr4 = {12,13,6,-7};
        System.out.println(arr4[2]);// 6
        
        arr4[2] = 99;
        System.out.println(arr4[2]);// 99
	}
}
