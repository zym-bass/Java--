package com.yiming.reflect;

/*
    获取到Class，能干什么？
        通过CLass的newInstance()方法可以创建该类的对象


*/
public class ReflectTese02 {
    public static void main(String[] args) {


        try {

            //通过反射机制，获取Class,通过CLass来实例化对象
            Class c = Class.forName("com.yiming.reflect.User");

            //newInstance()这个方法会调用User这个类的无参数构造方法
            //重点是：newInstance()调用的是无参数构造，必须保证无参数构造是存在的
            Object o = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch ( IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
