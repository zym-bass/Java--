package com.yiming.java1028;

import java.util.ArrayList;
import java.util.Iterator;

/*      1. 每个集合对象的创建（new）

        2. 向集合中添加元素

        3. 从集合中取出某个元素

        4. 遍历集合

        5. 主要的集合类

        ArrayList

        LinkedList

        HashSet

        TreeSet

        HashMap

        Properties

        TreeMap*/
public class ArrayListTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //向集合添加元素
        list.add("String");
        list.add("String");
        list.add("String");
        list.add("String");
        list.add("String");

        //从集合中取出某个元素
        for(int i = 0;i<list.size();i++) {
            String a = list.get(i);//数组集合有下标
        }

        //修改集合 set(int index , Object o);
        list.set(1,"yiming");
        System.out.println(list.get(1));

        //删除集合
        list.remove(1);
        System.out.println(list);

        /*//清空集合
        list.clear();
        System.out.println(list);*/


        //方式一：
        //获取迭代器
        Iterator<String> it = list.iterator();


        while(it.hasNext()){
            String a = it.next();
            System.out.println(a);
        }

        //方式二：
        for(String a : list){
            System.out.println(a);
        }


    }
}
