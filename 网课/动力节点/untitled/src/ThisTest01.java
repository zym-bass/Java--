/*  this
        1.this是一个关键字，全部小写
        2.this是什么，在内存方面是怎么样的？
        一个对象一个this
        所以，严格意义上来说，this保存对象的内存地址，指向自身
        所以，严格意义上说，this代表的是"当前对象"

        3.this只能用在实例方法中,谁调用这个实例方法，this就是谁。
        所以this代表的是：当前对象
        4.“this”大部分情况可以省略
        5.this代表当前对象，静态方法中不存在当前对象

* */

public class ThisTest01 {
        static int i =100;
    public static void main(String[] args){
        System.out.println(i);
        Customer s = new Customer("李四");
        s.shopping();

        Customer c = new Customer("张三");
        c.shopping();
    }
}
//顾客类
class Customer{
    //属性
    //实例
    String name;

    //构造方法
    public Customer(){

    }
    public Customer(String name){
        this.name = name;
    }

    //顾客购物的方法
    //实例方法
    public  void shopping(){
        System.out.println(this.name+"正在购物");
    }

}
