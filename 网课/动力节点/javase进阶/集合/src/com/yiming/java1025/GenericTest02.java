package com.yiming.java1025;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    JDK之后引入了：自动类型判断机制.(又称为钻石表达式)
*/
public class  GenericTest02 {
    public static void main(String[]  args){
        //Array
        List<Animal01> myList = new ArrayList<>();
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        Iterator<Animal01> it = myList.iterator();
        while(it.hasNext()){
            Animal01 a = it.next();
            a.move();
        }
    }
}
