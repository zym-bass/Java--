package com.yiming.java11;

import java.lang.reflect.Method;

public class ReflectMethodTest {
    public static void main(String[] args) throws Exception {
        //获取类对象
        Class s = Class.forName("com.yiming.java11.ArgsTest");

        Object m =s.newInstance();

        //反射方法
        //首先确定类  然后再找方法
        //在一个类中方法就涉及到方法的重载overload  方法名相同 参数列表不同
        //所以肯定有个方法可写 方法名 参数列表的方法 即Class中返回值类型为Method getDeclaredMethod(String name , class...parameterType);
        //通过调用invoke(Method method ,...args);返回值为方法的返回值 但使用了多态，返回值Object



        Method method = s.getDeclaredMethod("s", String.class, int.class);
        Object h = method.invoke(m,"123",1);
        System.out.println(h);
    }
}
