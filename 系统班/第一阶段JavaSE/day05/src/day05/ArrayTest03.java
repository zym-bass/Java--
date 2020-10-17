package day05;

public class ArrayTest03 {
	public static void main(String [] args) {
		int[] arr  = new int[3];
		System.out.println(arr);//[I@15db9742
		arr[0] = 88;
		
		int[] arr1 = new int[3];
		System.out.println(arr1);//[I@6d06d69c
		System.out.println(arr[0]);//88
		
		arr1=arr;
		System.out.println(arr1);//[I@6d06d69c
		System.out.println(arr1[0]);//88
		
		arr1[0] = 3;
		System.out.println(arr[0]);//3
		System.out.println(arr1[0]);//3
	}

}
