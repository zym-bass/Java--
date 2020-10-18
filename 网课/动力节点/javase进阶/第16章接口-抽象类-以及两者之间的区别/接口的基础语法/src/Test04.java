
/*
    继承和实现都存在的话，代码应该怎么写？
        extends关键字在前
            implements关键字在后
*/
public class Test04 {
    public static void main(String[] args){
        //创建对象
        Flyable a = new Cat();
        a.fly();
    }
}
//动物类：父类
class Animal04{

}
//可飞翔的接口（是一对翅膀）
interface Flyable{
    void fly();
}
class Cat extends Animal04 implements Flyable{
    public void fly(){
        System.out.println("飞飞");
    }
}
class Snake extends Animal04{

}
class Pig extends Animal04 implements Flyable{
    public void fly(){
        System.out.println("猪在飞");
    }
}
