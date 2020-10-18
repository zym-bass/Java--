/*
    final修饰的变量，只能赋值一次
         如若赋值引用变量 ，即引用地址不会改变

    final修饰的引用：
        该引用只能指向1个对象，并且它只能永远指向该对象，无法再指向其他对象

    final修饰实例变量
        final修饰的变量，只能赋值一次
        在代码中必须有赋值的体现
    final修饰的实例变量一般添加static修饰 static final int S = 23;

    最终结论：
        Static final 联合修饰的变量称为“常量”
        常量名全部大写，每个单词之间采用下划线衔接

    常量：实际上和静态变量一样，区别在于
        常量的值不能变
        常量和静态变量，都是存在方法区，并且都是在类加载是初始化。
        常量一般是公开的

*/
public class FinalTest02 {
    public static void main(String[] args) {

    }
}
class User{
    //实例变量
    //final 修饰实例变量，final修饰的变量，只能赋值一次
    final int age;

    public User(int age) {
        this.age = age;
    }
    final int age01 = 10 ;
}
class Chinese {
    String idCard;
    String name ;
    static  final  String COUNTRY = "中国";
}
