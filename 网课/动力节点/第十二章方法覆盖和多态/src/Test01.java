/*
* 多态的基础语法：
*   1.学习多态语法之前，我们需要普及两个概念
*       第一个：向上转型
*           子类型-->父类型（自动类型转换）
*       第二个：向下转型
*           父类型——>子类型（强制类型转换）
*   注意：
*       无论是向上还是向下转型，两者之间必须有继承关系，否者不能转型
*       引用类型转换这里只有向上和向下转型
*       什么是多态？
*   2.多态指的是：
*       父类型引用指向了子类型对象
*       包括编译阶段和运行阶段
*       编译阶段：绑定父类的方法
*       运行阶段，动态绑定了类型对象的方法
*       多种形态：
*
* */
public class Test01 {
    public static void main(String []  args){
        Animal a1 = new Animal ();
        a1.move();//动物在移动
       /* Cat    a2 = new Cat ();
        a2.move();//猫在跑*/
        Bird   a3 = new Bird();
        a3.move();//鸟在飞

        //代码这样写可以吗？
        /* 1. Animal 和Cat之间有继承关系吗？
           2. Animal是父类 ，Cat是子类
           3. Cat is Animal
        */
        Animal a4 = new Cat();
        //分析a4.move()
        //java程序分为编译和运行阶段
        //  对于编译器来说，编译器只知道a4的类型是Animal
        //  所以编译器在检查语法的时候，会去Animal.class
        //  字节码文件中找到move()方法，找到了，绑定move()
        //  方法，编译通过，静态绑定成功。（编译阶段属于静态绑定。）
        //
        //  运行阶段：
        //     阶段的时候，实际上是在堆内存中创建的java对象是
        //      Cat对象，所以move的时候，真正参与move的对象是一只猫
        //      所以运行阶段会动态去执行Cat对象的move()方法，这个过程
        //      属于运行阶段会动态执行Cat对象的move()对象，这个过程，
        //      属于运行阶段绑定（运行阶段绑定属于动态绑定）
        //
        Animal a5 = new Bird();
        a4.move();
        a5.move();
        Animal a6 = new Cat();//底层是一只猫
        //在Java编译的时候 .class文件中Animal类中没有catchMouse()方法及找不到
        //a6.catchMouse();
    }
}
