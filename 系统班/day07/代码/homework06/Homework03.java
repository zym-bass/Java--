package com.ujiuye.homework06;

public class Homework03 {
	/*3.�����������󣬲��ô���ʵ�֣�
	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����*/
	public static void main(String[] args) {
         // 1. �����һ������
		 int[] arr = {20,2,9,15,6,5,7,18,1};
		 // 2. ��������arr, ��ȡ��arr�����е����ֵ����Сֵ, ����ͬʱ��Ҫ���ֵ����Сֵ��Ӧ����λ��
		 if(arr != null && arr.length > 0) {
			 // 3. max��ʾ����arr�е����ֵ
			 int max = arr[0];
			 // 4. maxIndex��ʾ���ֵ��Ӧ������λ��
			 int maxIndex = 0;
			 // 5. min��ʾ����arr�е���Сֵ
			 int min = arr[0];
			 // 6. minIndex��ʾ��Сֵ��Ӧ������λ��
			 int minIndex = 0;
			 
			 for(int index = 1; index < arr.length; index++) {
				 int ele = arr[index];
				 if(ele > max) {
					 max = ele;
					 maxIndex = index;
				 }
				 
				 if(ele < min) {
					 min = ele;
					 minIndex = index;
				 }
			 }
			 
			 System.out.println(max + "---" + maxIndex);
			 System.out.println(min + "---" + minIndex);
			 
			 // 7. ���ֵ���������λ�ý���
			 arr[maxIndex] = arr[arr.length-1];
			 arr[arr.length-1] = max;
			 
			 // 8. ��Сֵ���һ������λ��Ԫ�ؽ���
			 arr[minIndex] = arr[0];
			 arr[0] = min;
			 
			 // 9. ���������е����ݻ�ȡ�������滻֮����
			 for(int index = 0; index < arr.length; index++) {
				 System.out.print(arr[index] + "  ");
			 }
			 
		 }else {
			 System.out.println("���鲻��Ϊnull,������������Ҫ��Ԫ�ش���");
		 }
	}
}
