//构造代码块
// b先有JVM虚拟机进行默认赋值 b = 0
// 静态代码块先给b赋值
//静态方法
//实例方法
//静态方法
//构造方法
public class Test01 { // 静态代码块 静态成员变量 创建对象之前 构造代码块执行=成员变量  构造方法=对象名。属性和方法调用
    {
        System.out.println("实例块a");
    }

    static{
        //b = 12;
        System.out.println("b");
    }

    private  int a= methoda();
    private static int b=methodb();
    private static int c=4;

    public static  int  methodb() {
        System.out.println("静态属性b");
        System.out.println(b);
        return 9;
    }

    private  int  methoda() {
        System.out.println("属性a");
        return 8;
    }

    private static  void  methodc() {
        System.out.println("静态属性c");
    }

    public Test01(int a, int b) {
        this.a=a;//1
        this.b=b;//2
    }

    //构造代码块
    {
        System.out.println("实例块b");
        System.out.println(a);
    }

    public static void main(String[] args) {

        Test01 o=new Test01(1,2);
        //System.out.println(a);  //直接调用a和methoda()会出错，因为静态方法不能直接访问所属类的非静态变量和方法
        //System.out.println(o.methodc());
        System.out.println(o.methoda());
        System.out.println(o.a);//  //非静态变量和方法的访问，需要通过对象
        System.out.println(b);    //此处b为静态变量，可在main的静态方法中直接访问


    }
}
//b=0
//"静态b"
//"0"
//b=9 c=4
//“实例块a”
//a=0 "属性a"  a=8
//"实例块b"
//"8"
//a=1 b=2
//"属性a"
//"8"
//"1"
//“2”
