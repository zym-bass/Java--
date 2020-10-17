
/*
    super运算符在什么时候必须要用：
        当子类变量名与父类变量名重名时，想要在子类中使用父类特征时既要用super

*/
public class SuperTest02 {
    public static void main(String[] args){
        Vip v = new Vip("张三");
        v.shopping();
        v.doSome();
    }
}
class Customer{
    String name;
    public Customer (){}
    public Customer (String name){
        this.name = name;
    }
    public void doSome(){
        System.out.println(this.name +"do some!");
        System.out.println(name +"do some!");
    }
}
class Vip extends Customer{

    //假设子类定义一个同名属性
    String name;

    public Vip(){}
    public Vip(String name){
        super(name);
    }
    public void shopping(){
        System.out.println(this.name+"正在购物");
        System.out.println(super.name+"正在购物");
        System.out.println(name+"正在购物");
        super.doSome();

    }

}