/*
* 测试：子类能否继承父类方法
*
* */

public class ExtendsTest02 {
    public static void main(String[] args ){

        //创建子类对象
        Cat  s =  new Cat();
        //调用方法
        s.move();
        System.out.println(s.name);
    }
}
//父类
//class Animal extends object{
class Aniaml {
    //名字
    String name = "小花";

    //提供一个动物移动的方法
    public void move(){
        System.out.println(name+"正在移动!");
    }
}
//Cat 子类  父类构造方法不能被执行
class Cat extends Aniaml{

}
