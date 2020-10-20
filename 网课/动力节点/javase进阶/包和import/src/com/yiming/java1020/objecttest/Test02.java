package com.yiming.java1020.objecttest;

import java.util.Objects;

/*
* 1.关于Object类中的equals方法
*   1. equals方法的源代码
*   equals
    public boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
    equals 方法在非空对象引用上实现相等关系：

    自反性：对于任何非空引用值 x，x.equals(x) 都应返回 true。
    对称性：对于任何非空引用值 x 和 y，当且仅当 y.equals(x) 返回 true 时，x.equals(y) 才应返回 true。
    传递性：对于任何非空引用值 x、y 和 z，如果 x.equals(y) 返回 true，并且 y.equals(z) 返回 true，那么 x.equals(z) 应返回 true。
    一致性：对于任何非空引用值 x 和 y，多次调用 x.equals(y) 始终返回 true 或始终返回 false，前提是对象上 equals 比较中所用的信息没有被修改。
    对于任何非空引用值 x，x.equals(null) 都应返回 false。
    Object 类的 equals 方法实现对象上差别可能性最大的相等关系；即，对于任何非空引用值 x 和 y，当且仅当 x 和 y 引用同一个对象时，此方法才返回 true（x == y 具有值 true）。

    注意：当此方法被重写时，通常有必要重写 hashCode 方法，以维护 hashCode 方法的常规协定，该协定声明相等对象必须具有相等的哈希码。


    参数：
    obj - 要与之比较的引用对象。
    返回：
    如果此对象与 obj 参数相同，则返回 true；否则返回 false。

* */
class MyTime01 {
        int year;
        int month;
        int day ;
    public MyTime01(){}
    public MyTime01(int year , int month , int day ){
            this.year = year;
            this.day = day ;
            this.month = month;
    }
    //重写toString()
    public String toString(){
            return year+"..."+day+"..."+month;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//完全相等 即引用指向的地址都相同

        if (o == null || getClass() != o.getClass()) return false;

        MyTime01 myTime01 = (MyTime01) o;//向下转型
        return year == myTime01.year &&
                month == myTime01.month &&
                day == myTime01.day;
        //使用getClass()输出调用该方法的对象类型的类是什么，
        //例如： Animal 类型的引用 a
        //  a.getClaee() == Animal.class;
        // 调用a.getClass() == 地址.....Animal //字节码文件地址
        //System.out.println(Test02.class);//class com.yiming.java1020.objecttest.Test02
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
    //重写equals()
   /* public  boolean equals(Object i){
        int year1 = this.year;
        int day1 = this.day;
        int month1 = this.month;

        int year2 = ((MyTime01)i).year;
        int day2 = ((MyTime01)i).day;
        int month2 = ((MyTime01)i).month;

        if(year1 == year2 && day1 == day2 && month1 == month2){
            return true;
        }else{
            return false;
        }
      }*/


}
public class Test02 {
    public static void main(String[] args){
        MyTime01 t1  = new MyTime01(13,332,42);
        MyTime01 t2  = new MyTime01(13,332,42);
        System.out.println(t1.equals(t2));//重写equals之前为false//重写后可判断
        System.out.println(t1.toString());
        System.out.println(Test02.class);//class com.yiming.java1020.objecttest.Test02
    }
}