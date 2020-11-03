package com.yiming.java1101;

public class ReturnTest01 {
    public static void main(String[] args) {
        int i = 10 ;
        int b = 20 ;
        Person p = new Person(10);
        doSome(i,b,p);
        System.out.println("i-->"+i);
        System.out.println("b-->"+b);
        System.out.println("p.age-->" + p.age);

    }
    public static void doSome(int num1 , int num2 ,Person p){
        p.age=1200;
        int x = num1;
        p=new Person(100);
        num1=num2;
        num2=x;
        System.out.println("num1-->"+num1);
        System.out.println("num2--->"+num2);
        System.out.println("p.age-->" + p.age);
    }
}
class Person{
    int age ;

    public Person() {
        super();
    }

    public Person(int age) {
        this.age = age;
    }
}
