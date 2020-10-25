package com.yiming.java1025;

import java.util.ArrayList;

/*
    ArrayList集合：
        ArrayList集合底层采用了数组这种数据结构

ArrayLIst集合是非线程安全的

1. ArrayList集合初始化容量是10

2. ArrayList集合底层是Object类型的数组Object[]

3. 初始化容量和自定义容量

    ArrayList a1 = new ArrayList(); 初始化容量为10

    ArrayList a2 = new ArrayList(20);

1. ArrayList集合的扩容：原容量的1.5倍

    ArrayList集合底层是数组，怎么优化？

        只能竟可能的减少扩容，因为数组扩容效率比较低，建议使用ArrayList集合

        的时候预估计元素的个数，给定一个初始化容量

1. 数组优点：

    检索效率比较高（每个元素占用空间一样空，地址是连续的）

1. 数组缺点：

    随机增删元素效率比较低

    数组无法存储大数据量

1. 先数组末尾添加元素，效率高，不受影响

2. 这么多的集合中，你用哪个最多？

    ArrayList 集合

    因为往数组末尾添加元素，效率不受影响

    另外，我们检索/查找某个元素的操作比较多


*/
public class ArrayList02 {
    public static void main(String[] args){
        //默认容量为10的数组
        ArrayList a = new ArrayList();

        //自定义容量为20的数组
        ArrayList a2 = new ArrayList(20);


    }
}
