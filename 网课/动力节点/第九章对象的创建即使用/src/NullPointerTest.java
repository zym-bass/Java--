/*  空指针异常
    关于垃圾回收器 GC
    在java语言中，垃圾回收器蛀牙针对的是堆内存
    当一个Java对象没有任何引用指向该对象的时候
    GC会考虑将该垃圾数据释放回收掉。

    出现空指针异常的前提条件？
    “空引用”访问实例相关的数据时，都会出现空指针异常；
* */
public class NullPointerTest {
    public static void main(String[] args){
        //创建客户对象
        User c = new User();
        //访问这个客户的ID
        System.out.println(c.id);
        //对该客户重新赋值
        c.id = 231412;
        System.out.println("客户的ID是："+c.id);
        c = null ;
        //编译器没有问题，因为编译器只检查语法，编译器发现c是User类型
        //User类型中有id属性，所有可以:c.id语法过了。
        //但运行的时候需要对象的存在，但是对象没有了，尴尬类，就只能出现一个异常
        System.out.println(c.id);
    }

}
