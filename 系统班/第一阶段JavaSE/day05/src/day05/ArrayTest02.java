package day05;

public class ArrayTest02 {
	public static void main(String [] args) {
		int[] arr = new int[3];
		// 1. ��������Ԫ�ؽ��ж�̬��ֵ
		arr[0] = 15;
		arr[1] = 99;
		// arr[2] = -7;
		int[] a = new int[0];
		//a[0] = 1 ;
		//arr [2]  = a[0];

		// 2. ��ȡ������Ԫ��ֵ
		int first = arr[0];

		System.out.println(first);// 15
		System.out.println(arr[1]);// 99
		System.out.println(arr[2]);// 0
//
//		double[] arr1 = new double[5];
//		System.out.println(arr1[2]);// 0.0
//
//		String[] arr2 = new String[2];
//		System.out.println(arr2[0]);// null
	}

}
