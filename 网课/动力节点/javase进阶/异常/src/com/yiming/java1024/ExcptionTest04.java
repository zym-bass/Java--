package com.yiming.java1024;
/*

*/
public class ExcptionTest04 {
    public static void main(String[] args){

        try{
            System.out.println("try.....");
            return ;
        }finally{ //放在finally的语句块一定会被执行
            System.out.println("finally....");
        }
    }
}
