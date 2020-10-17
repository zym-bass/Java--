package com.ujiuye.array;

public class Demo10_数组元素的查找 {

	public static void main(String[] args) {
        int[] arr = {12,99,88,7,88,7};
        //查找元素7在数组arr中第一次出现的索引位置
        int ele = 7;
        if(arr != null && arr.length > 0) {
        	// endIndex表示元素ele在数组中出现的索引位置,初始值给-1,初始认为找不到
        	// int endIndex = -1;
        	// 1. 遍历数组arr, 获取到数组中的每一个元素
        	for(int index = 0; index < arr.length; index++) {
        		int arrayEle = arr[index];
        		// 2. 将数组中元素与目标数据进行比较
        		if(arrayEle == ele) {// 找到了
        			//endIndex = index;  给endIndex赋值
        			System.out.println(index);
        			break;
        		}
        		// 3. 当循环执行到最后一次, 还没有结束循环,证明没有找到元素ele
        		if(index == arr.length-1) {
        			System.out.println("-1");
        		}
        	}
        	
        	//System.out.println(ele + "在数组arr中第一次出现索引位置为: "+endIndex);
        	
        }
        
	}
}
