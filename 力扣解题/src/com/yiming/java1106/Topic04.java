package com.yiming.java1106;

import java.util.Arrays;

public class Topic04 {
    public static void main(String[] args) {
        int [] nums = {-2,-1};
        int len = nums.length;
        if(nums.length<2){
            System.out.println(nums.length);
        }
        int x = 0;
        int max = 1;
        for(int i = 0 ;  i< len-1 ;i++){
            if(nums[i] < nums[i+1]){
                x+=2;
            }
            if((nums[i] > nums[i+1] || i==len-2 ) && x> max  ){
                max = x ;
                x=0;
            }
        }
        Arrays.fill(nums ,1);
        System.out.println(max);
    }
}
