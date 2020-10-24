package com.yiming.java1023;

//import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
/*
        for(int x = 0 ;x<60;x++ ) {
            Random random = new Random(87);
            int i = random.nextInt(23);
            System.out.println(i);
        }*/
        Random random = new Random();
        int index = 0;
        while (index < arr.length) {
            int num = random.nextInt(6);

            if (estimate(num, arr)) {
                arr[index++] = num;
                System.out.println(arr[index - 1]);
            }

        }





    }

    public static boolean estimate(int num, int[] arr) {
        //对数组升序
        //Arrays.sort(arr);
        // 进行二分法查找
        //return Arrays.binarySearch(arr, num)<0;

       /* if (Arrays.binarySearch(arr, num)>=0){
            return false;
        }
        return true;*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return false;
            }
        }
        return true;
    }

}
