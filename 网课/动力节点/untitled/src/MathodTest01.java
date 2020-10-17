/*
* 带有static的方法
* 没有static的方法
* 分别怎么调用
* //带有static的方法怎么调用?通过“类名.”的方式访问
*
*   //对象被称为实例
*   //实例有关的有：实例方法是对象方法
*   //实例变量时对象变量,实例方法是对象方法。
*   //实例相关的都需要先new对象，通过“引用”的方式去访问
*
* */

public class MathodTest01 {
    public static void main(String[] args){
        MathodTest01.doSome();
        //类名.可以省略（在同一个类中）

        //创建对象
        MathodTest01 p = new MathodTest01();
        //通过“引用”的方式访问实例方法
        p.doOther();
    }

    public static void doSome(){
        System.out.println("do  some");
    }

    //实例方法（对象相关的方法，对象级别的方法，应该是一个对象级别的行为）
    //方法模拟的是对象的行为动作
    public void doOther(){ //实例方法
        System.out.println("do other");
    }
}
