package com.ujiuye.array;

public class Demo09_���鷴ת {

	public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         
         for(int beginIndex = 0, endIndex = arr.length-1 ; 
        		 beginIndex < endIndex; beginIndex++, endIndex--) {
        	 // ����Ԫ���滻
        	 int temp = arr[beginIndex];
        	 arr[beginIndex] = arr[endIndex];
        	 arr[endIndex] = temp;
         }
         getAllArrayEle(arr);
	}
	
	public static void getAllArrayEle(int[] arr) {
		if(arr != null && arr.length > 0) {
			for(int index = 0 ; index < arr.length ; index ++) {
				System.out.println(arr[index]);
			}
		}
	}
}
