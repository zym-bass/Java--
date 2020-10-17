
/*
* 2.1.多态练习题
编写程序模拟“主人"喂养宠物"的场景:
*
提示1：
主人类: Master
宠物类: Pet
宠物类子类: Dog、 Cat、 YingWu
*
提示2：
主人应该有喂养的方法: feed()
宠物应该有吃的方法: eat()
只要主人喂宠物，宠物就吃。
*
要求:主人类中只提供一个喂养方法feed(),要求达到可以喂养各种类型的宠物.
*
编写测试程序:
创建主人对象..
创建各种宠物对象
调用主人的喂养方法feed()，喂养不同的宠物，观察执行结果。
通过该案例，理解多态在开发中的作用。
重要提示: feed方法是否需要一一个参数， 参数选什么类型! ! !

*
* */
/*
* 测试多态在开发中的作用
*
* */
import java.util.Scanner;
public class Practice01 {
    public static void main (String[] args){

        //创建主人对象
        Master  ms = new  Master();
        /*Scanner s = new Scanner(System.in);
        System.out.println("请选择要喂养的宠物");
        int number  = s.nextInt();
        ms.feed(number);*/

        //创建狗对象
        Dog zhangao = new Dog();
        ms.feed(zhangao);

        //创建猫对象
        Cat02 xiaoMao = new Cat02();
        ms.feed(xiaoMao);

        //创建鹦鹉对象
        YingWu  y = new YingWu();
        ms.feed(y);



    }

}
/*      OCP（开闭原则）
        什么是开闭原则？
            对扩展开放，对修改关闭
            在软件的扩展当中，修改的越少越好

        面向父类型编程，面向抽象进行编程，不建议面向具体编程
        因为面向具体编程会让软件的扩展性很差
* */