package com.ujiuye.array;

public class Demo07_������� {

	public static void main(String[] args) {
		int[] arr = {66,1234,0,-98};
		getAllElementFromArray(arr);
	}
	
	// �����һ������ : ���ܾ��ǿ��Ի�ȡ��int[]�����е�ÿһ��Ԫ��(����)
	public static void getAllElementFromArray(int[] arr) {
		 if(arr != null && arr.length > 0) {
			 // 1. ����������λ��Ϊѭ������
			 for(int index = 0; index <= arr.length-1; index++) {
				 // 2. ��ѭ���ڲ�, ����ʹ��������[index]��ȡ����Ԫ��
				 int ele = arr[index];
				 System.out.println(ele);
			 }
		 }else {
			 System.out.println("����Ϊnull����������û��Ԫ��, ��ô��Ч����");
		 }
	}
}
