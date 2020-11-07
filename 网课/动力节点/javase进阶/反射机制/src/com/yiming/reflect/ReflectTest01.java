package com.yiming.reflect;

/*

        方法一：使用Class.forName(String dizhi);
         Class c = Class.forName("完整类名带包名");
         方法二：使用getClass();
         Class c = 对象.getClass();
         方法三：
         Class c = 类型.class;
*/
public class ReflectTest01 {
    public static void main(String[] args) {
        /*
            Class.forName()
                1. 静态方法
                2. 方法参数是一个字符串
                3. 完整类名必须带有包名。java.lang包也不能省略。
                4. 完整类名必须带有包名。java.lang包也不能省略


        */
        Class c1 = null;
        try {

            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.System");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*
            Java中任何一个对象都有一个方法：getClass()
        */

        String s  = "abc";
        Class x = s.getClass();
        System.out.println(x == c1);

        //第三种
        Class c4 = String.class;
        System.out.println(x == c4);


    }
}
