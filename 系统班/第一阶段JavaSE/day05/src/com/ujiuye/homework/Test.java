package com.ujiuye.homework;

public class Test{
    public static void main(String[] args){
            int[] arr = {1,4,5,12,2,99};

            for(int i = 0 ; i<arr.length ; i++){
                System.out.println(arr[i]);
             }
            //���ֵ�洢λ��
             int max = arr[0];
            //��Сֵ�洢λ��
             int min = arr[0];

             for(int i = 1 ; i<arr.length ; i++){
                    if(max<arr[i]){
                        max = arr[i];
                    }
                    if(min >arr[i]){
                        min = arr[i];
                    }
           }
            System.out.println("���������ֵΪ��"+max+"\n"+"��������СֵΪ��"+min);
    }
}
