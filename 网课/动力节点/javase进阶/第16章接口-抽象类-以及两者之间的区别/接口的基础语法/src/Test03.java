/*
    接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？

        对于计算机来说，一个机箱上有多个接口，相似

        *****一个类可以同时实现多个接口

 */
public class Test03 {
    public static void main(String[] args) {
        A03 a  = new D03();
        B03 b  = new D03();
        C03 c  = new D03();

        ((B03)a).m2();
        B03 b1 = (B03)a;
        b1.m2();
    }
}
interface A03{
    void m1();
}
interface B03{
    void m2();
}
interface C03{
    void m3();
}
//一个类可以实现多个接口
class D03 implements A03,B03,C03{
    public void m1(){
    }
    public void m2(){
        System.out.println("fwfe");

    }
    public void m3(){

    }
}
