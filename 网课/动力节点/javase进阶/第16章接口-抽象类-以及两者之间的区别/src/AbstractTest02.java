/*
    抽象类:
        1. 抽象类中不一定有抽象方法,抽象方法必须在凑象类中
        *****
        2. 以非抽象类继承抽象类,必须把抽象类中的方法实现了(覆盖啦).

 */
public class AbstractTest02 {
    public static void main(String [] args ){
        //能不能使用多态
        //父类引用指向子类型对象
        //向上转型
        Animal  a   = new B02();//这就是面向抽象编程
        a.move();//编译时a.move()是Animal的,在运行时是B02的move();
        //向下转化
        B02 s = (B02) a ;
    }
}
//动物类(抽象类)
abstract class Animal{

    //抽象方法
    public abstract void move();
}
//子类 (非静态调用)
 class B02 extends Animal{
    //B02不是抽象的, 并且未覆盖Animal中的抽象方法move()
    public void move(){

    }
}
