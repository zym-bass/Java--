
/*
*
*   1.使用static关键字可以定义，静态代码块
*   2.什么是静态代码块，语法是什么？
*       static{
*           java语句；
*       }
*     静态代码块一般是按照自上而下的顺序执行
*     静态代码块的作用
*     第一:静态代码块不是那么常用
*     第二: 写记录日志的代码 量身定做
*     静态代码块 只执行一次
* */
public class StaticTest06 {

    //静态代码块
    static{
        System.out.println("A");
    }

    //一个类当中可以编写多个静态代码
    static {
        System.out.println("B");
    }

    static int i = 100;
    int k = 100;
    //入口
    public static void main(String[] args){
        System.out.println("HelloWorld");
        StaticTest06 s = new StaticTest06();
        System.out.println(s.k);
    }

    static {
        System.out.println("C");
    }
}
/*
* 总结：
*   到目前为止,你遇到的所有Java程序，有顺序要求的是拿些？
*       第一：对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行
*       第二：静态代码块1和静态代码块2是有先后期顺序的
*       第三：静态代码块和静态变量时有先后顺序的
*
*
* */