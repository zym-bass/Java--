package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    1. JDK5.1之后推出的新特性：泛型 generic
    2. 泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。
    3. 使用了泛型好处是什么？
        第一：集合中存储的元素类型统一了
        第二：从集合中取出的元素类型是泛型指定的类型，不需要进行大量的向下转型
    4. 缺点是：导致集合的存储的元素缺乏多样性
*/
public class GenericTest01 {
    public static void main(String[]  args){



       /* //不使用泛型机制，分析程序存在缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象放进集合中
        myList.add(c);
        myList.add(b);

        Iterator it = myList.iterator();
        while(it.hasNext()){
            Object o = it.next();
            if(o instanceof Cat) {
                ((Cat) o).catchMouse();
            }else if(o instanceof Bird){
                ((Bird)o).move();
            }


        }*/
        //使用泛型List<Ainmal>之后，表示List集合中只允许存储Animal类型的数据
        //用泛型来指定集合中存储的数据类型
        List<Animal01> myList = new ArrayList<Animal01>();
        //指定list集合中只能存储Animal,那么存储String就编译报错了
        //使用到了泛型之后，集合中元素的数据类型更加统一了
        //myList.add("abc");
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
class Animal01{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal01{
    public void move(){
        System.out.println("猫在跑");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Bird extends Animal01{

    public void move(){
        System.out.println("鸟儿在飞翔");
    }
}

