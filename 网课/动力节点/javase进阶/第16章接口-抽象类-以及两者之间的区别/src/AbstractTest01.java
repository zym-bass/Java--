/*
    类到对象是实例化，对象到类是抽象。
    抽象类：
        1. 什么是抽象类？
        类和类之间具有共同特征，将这些共同特征提取出来，形成的就是抽象类
        类本
        2.抽象类属于什么类型？
        抽象类也属于引用数据类型
        3. 抽象类怎么定义?
        语法:
            [修饰符列表] abstract class 类名{
                类体;
            }
        4. 抽象类是无法实例化的,无法创建对象的,所以抽象类是用来被继承的.
        5. final和abstract不能联合使用,这两个关键字是对立的
        6. 抽象类的子类可以是抽象类,也可以是非抽象类
        7. 抽象类虽然无法实例化,但是抽象类有构造方法,这个构造方法是供子类使用的
        8. 抽象类关联到一个概念:抽象方法,什么是凑想方法呢?
            凑想方法表示没有实现的方法,没有方法体的方法,例如:
            public abstract void doSome();
            抽象方法特点是:
                特点1: 没有方法体,以分号结尾
                特点2: 前面修饰符列表中有abstract关键字.
*/

public class AbstractTest01 {
    public static void main(String[] args) {

    }

}
abstract class Account {
    public Account (){ }
    public Account (String a){}
    //非抽象方法
    public void doOther(){

    }
    //抽象方法
    public abstract void withdraw();

}
class B extends Account{
    public B(){
        super();
    }

    //覆盖抽象方法
    public void withdraw(){
        return;
    }
}
