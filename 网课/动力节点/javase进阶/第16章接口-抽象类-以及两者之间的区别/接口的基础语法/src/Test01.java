/*
    接口：
        1. 接口也是一种引用数据类型，编译之后也是生成一个.class字节码文件
        2. 接口是完全抽象的（抽象类是半抽象），或者也可以说接口是特有的抽象类
        3. 接口怎么定义的，语法是什么？
            [修饰符类表] interface 接口名{}
        4. 接口继承多继承，一个接口可以继承多个接口
        5. 接口中包含两部分内容：一部分是：常量
                             一部分是：抽象方法
        6. 接口中所有的元素都是公开的（都是公开的）
        7. 接口中的抽象方法定义时：public abstract  修饰都可以省略
        8. 接口中的方法都是抽象方法，所以接口中的方法不能有方法体
        9. 接口中常量的public static final 可以省略。
 */
public class Test01 {
    public static void main(String[] args) {
    System.out.println(MyMath.B2);
    }
}

//定义接口
interface A {}
//定义接口
interface B extends A {}

//一个接口支持继承多接口
interface C extends A,B{}
//我的数学接口
interface MyMath{
    //抽象方法
    //public abstract  int sum(int a, int b);
    //public abstract final double B2 = 242.3;
    double B2 = 242.3;
    //
    int sum(int a , int b );
    int sub(int a , int b );

}