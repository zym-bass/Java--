package com.yiming.java1105;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import static sun.swing.MenuItemLayoutHelper.max;

public class Topic02 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        for(int i = 1 ;i<len ; i++){
            nums[i]+= nums[i-1]>0 ? nums[i-1]:0;
        }
        Arrays.sort(nums);
        return nums[len-1];
    }
}
/*
53. 最大子序和
        给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

        示例:

        输入: [-2,1,-3,4,-1,2,1,-5,4]
        输出: 6
        解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
        进阶:

        如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。*/
