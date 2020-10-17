package com.ujiuye.array;

public class Demo01_数组定义 {

	public static void main(String[] args) {
		int i = 15;
		
        int[] arr = new int[3];
        System.out.println(arr);//[I@15db9742 // 类比 : 1号楼2116
        
        double[] arr1 = new double[5];
        System.out.println(arr1);//[D@6d06d69c
        
        String[] arrName = new String[63]; 
        System.out.println(arrName);//[Ljava.lang.String;@7852e922
	}

}
