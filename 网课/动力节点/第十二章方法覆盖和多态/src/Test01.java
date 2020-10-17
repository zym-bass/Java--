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
*   3.什么时候必须向下转型？
*       父类方法中没有，只有子类有，并且需要
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
        //假设代码运行到到了55行//a6.catchMouse();
        // 在编译阶段 JVM认为a6还是Animal对象就去Animal类中找catchMouse（）方法但是没有找到
        // ，编译器报错找不到符号
        //向上转型只能运行方法覆盖的方法但是不能运行其子类特有的方法
        // 但是要能运行必须父类方法与子类方法 之间形成方法覆盖 即：不在同一类中 返回类型相同 方法名相同 形式参数相同
        //向下转型的目的：调用子类特有的方法，
        //向下转型前必须先进行向上转型
        ((Cat)a6).catchMouse();//父类转换成子类 用向下转型
        //向下转型风险：
        Animal a7 = new Bird();//表面上a6是一个Animal，但在运行时a7转换成了Bird的方法，即会被方法覆盖

        //编译阶段
        //a7还是Animal 在a7向下转型为Cat，符合向下类型转换条件

        //运行阶段
        //a7动态绑定 即a7成为Bird
        // 再进行Cat类型转换，即子类向子类转换，两者之间没有继承关系，运行出问题
        //运行时出现异常，java.lang.ClassCastException

       /* Cat y = (Cat)a7;
        System.out.println("\n");
        y.catchMouse();*/

        //怎么避免ClassCastException异常的发生？
        /*  instanceof(运行阶段动态判断)
            第一：instanceof可以在运行阶段动态判断
        *   第二：instanceof的语法
                （引用 instanceof 类型）
            第三：instanceof运算符的结果只能是：true false
            第四：c 是一个引用  c 变量保存了内存地址指向类堆中的对象
                假设（c instanceof Cat）为true 表示
                    c引用指向的堆内存空间中的Java对象是一个Cat
                假设（c instanceof  Cat）为false 表示
                    c引用指向的堆内存空间中的Java对象不是一个Cat
        * */
        if(a7 instanceof Cat){
            System.out.println("对象类型符合向下转型");
            Cat y =(Cat) a7;
            y.catchMouse();
        }else{
            System.out.println("对象类型不符合向下转型");
        }

    }
}
