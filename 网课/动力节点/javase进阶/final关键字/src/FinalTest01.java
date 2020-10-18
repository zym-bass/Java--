/*
        final
            1. final是JAVA语言中的一个关键字
            2. final表示最终的，不可再来的
            3. final可以修饰变量以及方法，还有类等
            4. final修饰的变量？
                值不能被修改
                final修饰的变量只能赋值一次
            5. final修饰的方法？
                无法被覆盖
            6. final修饰的类？
                无法被继承


*/
public class FinalTest01 {
    public static void main(String[] args) {
        //局部变量
        int i = 1000 ;
        i = 200 ;
        final int x = 100 ;//最终变量x即不能重新赋值

    }
}
final class A{

}
/*
class B extends A{

}
*/
/*
class MyString extends String {

}*/
//final 方法不能被覆盖
/*
class B {
    public final void doSome(){

    }
}
class C extends B{
    public void doSome(){

    }
}*/
