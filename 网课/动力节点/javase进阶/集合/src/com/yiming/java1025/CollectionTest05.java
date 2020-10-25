package com.yiming.java1025;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args){
        //创建集合对象
        Collection c = new ArrayList();
        Animal a1 = new Animal("一名");
        c.add(a1);
        Animal a2 = new Animal("一名");
        System.out.println(c.contains(a2));

        System.out.println("当前元素的集合个数为：" + c.size());
        //同理remove()方法也调用了equals()方法
        Animal a3 = new Animal("一名");
        c.remove(a3);
        System.out.println("当前元素的集合个数为：" + c.size());
    }
}
class Animal{
    private String name ;
    public Animal(){
        super();
    }
    public Animal(String name){
        this.name = name;
    }

    //重写equals方法
    public boolean equals(Object o) {
        if (o == null && !(o instanceof Animal)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Animal c = (Animal) o;
        /*if (c.name.equals(this.name)) {
            return true;
        }
        return false;*/
        return c.name.equals(this.name);
    }

}
