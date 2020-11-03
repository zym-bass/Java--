package com.yiming.java1101;

import java.util.Arrays;

public class number {
    int i =10;
    public static void main(String[] args) {
        int[] i = {1,1,2};
        int x  =removeDuplicates(i);
        String s = "121424";
        int j =Integer.parseInt(s);

    }
    public static int removeDuplicates(int[] nums) {
        number n = new number();
        n.i=10;
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
