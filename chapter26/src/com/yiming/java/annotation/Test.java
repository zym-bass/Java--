package com.yiming.java.annotation;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,4,5,6,7};
        rotate(nums ,1 );
        for(int i : nums){
            System.out.println(i);
        }
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int x =nums[0];
        for(int i =0 ; i< len -1 ; i++){
            int a =x ;
            x = nums[i+1];
            nums[i+1] = a;
        }
        nums[0]=x;
        k--;
        if(k>0){
            rotate(nums,k);
        }
    }
}
