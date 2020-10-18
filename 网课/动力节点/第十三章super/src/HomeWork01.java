/*猜数字游戏
一个类A有一个实例变量V，从键盘接收一个正整数作为实例变量v的初始值。
另外再定义一个类B，对A类的实例变量v进行猜测。
如果大了则提示大了
小了则提示小了
等于则提示猜测成功
*/
import java.util.Scanner;
public class HomeWork01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //自己写的方法
    /*System.out.print("请输入一个让另一个用户猜：");
    A01 a = new A01(s.nextInt());
    while(true) {
        System.out.print("请才刚才用户输出的数字：");
        B01 b = new B01(s.nextInt(), a.v);
        b.set();
    }
    }*/
        System.out.print("请输入一个让另一个用户猜：");
        A01  a = new A01(s.nextInt());
        B01 b = new B01(a);
        while(true) {
            System.out.print("请才刚才用户输出的数字：");
            b.set(s.nextInt());
        }

    }


}
class A01{
    int v ;
    public A01(){}
    public A01(int v){
        this.v = v ;
    }
}
/*class B01 extends A01{
    int x;
    public  B01 (int x , int v){
        super.v = v;
        this.x = x ;
    }
    public void set (){
        if(this.x == super.v){
            System.out.println("猜测成功");
            System.exit(0);//强行退出JVM.
        }else if(this.x < super.v){
            System.out.println("猜小了");
        }else{
            System.out.println("猜大了");
        }

    }
}*/
class B01 {
    A01 a ;
    public B01(A01 a){
        this.a = a ;
    }
    public void set (int number) {
        if (number == a.v) {
            System.out.println("猜测成功");
            System.exit(0);//强行退出JVM.
        } else if (number < a.v) {
            System.out.println("猜小了");
        } else {
            System.out.println("猜大了");
        }
    }

}
