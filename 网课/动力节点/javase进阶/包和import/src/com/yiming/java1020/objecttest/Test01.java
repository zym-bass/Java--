package com.yiming.java1020.objecttest;
/*
    toString
    public String toString()返回该对象的字符串表示。
    通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。
    结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。
    Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号十六进制表示组成。
    换句话说，该方法返回一个字符串，它的值等于：

    getClass().getName() + '@' + Integer.toHexString(hashCode())

    返回：
    该对象的字符串表示形式。
    2.该对象的字符串表示形式
    3. 结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。

    public String toString(){
        return year+"..."+day+"..."+month;

    }

* */
class MyTime{
    int year;
    int month;
    int day ;
    public MyTime(){}
    public MyTime(int year , int month , int day ){
        this.year = year;
        this.day = day ;
        this.month = month;
    }
    /*public String toString(){
        return year+"..."+day+"..."+month;

    }*/

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
public class Test01 {
    public static void main(String[] args){
        MyTime ti  = new MyTime(13,332,42);
        System.out.println(ti.toString());
    }
}
