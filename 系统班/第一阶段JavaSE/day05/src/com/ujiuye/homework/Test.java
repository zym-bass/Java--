package com.ujiuye.homework;

public class Test{
    public static void main(String[] args){
            int[] arr = {1,4,5,12,2,99};

            for(int i = 0 ; i<arr.length ; i++){
                System.out.println(arr[i]);
             }
            //最大值存储位置
             int max = arr[0];
            //最小值存储位置
             int min = arr[0];

             for(int i = 1 ; i<arr.length ; i++){
                    if(max<arr[i]){
                        max = arr[i];
                    }
                    if(min >arr[i]){
                        min = arr[i];
                    }
           }
            System.out.println("数组中最大值为："+max+"\n"+"数组中最小值为："+min);
    }
}
