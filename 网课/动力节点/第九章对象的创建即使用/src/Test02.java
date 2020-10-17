/*
*
* */

public class Test02 {
    public static void main(String[] args){
        Person  p = new Person();//在堆内存空间建立一个Person的对象 引用p指向这个对象在堆内存的地址
        p.age = 10;//赋值给堆内存的Person的age对象
        System.out.println(p.age);
        add(p);//将地址传给add（）内的形参
        System.out.println(p.age);
        Person p1 = p;
        String x = "";
        for(int i = 0 ; i < 5 ; i++ ){
            x+=i;
        }
        System.out.println(x);

    }
    public static void add(Person p){  //创建一个引用类型 即将主函数的引用p的地址传给的这个方法的引用p
        p.age++;//原值为10  修改堆内存的Person对象里的age的值
        System.out.println(p.age);
    }//方法运行完毕后
}
class Person{
    //年龄属性，成员变量中的实例变量
    int age;
}
