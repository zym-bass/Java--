/*
* 方法递归
* 方法自己调用自己
* */
//
public class RecursionTest01 {
    public static void main(String[] agrs){
        doSome();
    }
    public static void doSome(){
        System.out.println("doSome begin");
        //调用方法:doSome()既然是一个方法，那么doSome方法可以调用吗？可以
        doSome();
        //下面代码永远执行不到
        System.out.println("doSome over");
    }
}
