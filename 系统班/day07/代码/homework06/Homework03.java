package com.ujiuye.homework06;

public class Homework03 {
	/*3.分析以下需求，并用代码实现：
	(1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
	(2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组*/
	public static void main(String[] args) {
         // 1. 定义出一个数组
		 int[] arr = {20,2,9,15,6,5,7,18,1};
		 // 2. 遍历数组arr, 获取到arr数组中的最大值和最小值, 并且同时需要最大值与最小值对应索引位置
		 if(arr != null && arr.length > 0) {
			 // 3. max表示数组arr中的最大值
			 int max = arr[0];
			 // 4. maxIndex表示最大值对应的索引位置
			 int maxIndex = 0;
			 // 5. min表示数组arr中的最小值
			 int min = arr[0];
			 // 6. minIndex表示最小值对应的索引位置
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
			 
			 // 7. 最大值与最后索引位置交换
			 arr[maxIndex] = arr[arr.length-1];
			 arr[arr.length-1] = max;
			 
			 // 8. 最小值与第一个索引位置元素交换
			 arr[minIndex] = arr[0];
			 arr[0] = min;
			 
			 // 9. 遍历数组中的内容获取到数组替换之后结果
			 for(int index = 0; index < arr.length; index++) {
				 System.out.print(arr[index] + "  ");
			 }
			 
		 }else {
			 System.out.println("数组不能为null,或者数组中需要有元素存在");
		 }
	}
}
