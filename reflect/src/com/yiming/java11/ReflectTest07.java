package com.yiming.java11;

/*
    必须掌握：
        怎么通过反射机制访问一个Java对象的属性
            给属性值set
            获取属性的值get
*/

import com.yiming.bean.Student;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        Class student = Class.forName("com.yiming.bean.Student");
        Object obj = student.newInstance();

        Field[] fields = student.getDeclaredFields();
        for(Field s : fields){
            System.out.println(student.getDeclaredField(s.getName()));
            System.out.println(s);
        }
        /*
               虽然使用了反射机制，但是三要素还是缺一不可；
               要素一：obj对象
               要素二：no属性
               要素三：2222值
          注意：反射机制让代码复杂了，但是为了一个但是灵活
        */

        Field f = student.getDeclaredField("no");
        f.set(obj,123);
        //方式一
        Student s =  (Student)obj;
        System.out.println(s.no);
        System.out.println(f.get(obj));

        Field f2 = student.getDeclaredField("name");
        f2.setAccessible(true);
        f2.set(obj,"笨笨");
        System.out.println(f2.get(obj));
    }
}

