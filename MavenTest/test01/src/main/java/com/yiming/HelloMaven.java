package com.yiming;

public class HelloMaven {
    public int add(int n1 , int n2 ){
        return n1+n2;
    }
    public static void main(String[] args){
        HelloMaven hm = new HelloMaven();
        System.out.println(hm.add(10, 20));
    }
}
