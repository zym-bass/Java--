/*
public class T {
    A a;
    public static void main(String[] args) {
        D d = new D();
        C c = new C();
        B b = new B();
        A a = new A();
        T t = new T();
        c.d = d;
        b.c = c;
        a.b = b;
        t.a = a;
        //上面代码不执行的话 也就是 指的地址为null 出现空指针异常
        //编写代码通过t来访问d中的i
        System.out.println(t.a.b.c.d.i);
    }
}
 class A{
    B b ;
}
class B{
    C c;
}
class C{
    D d;
}
class D{
    int i =1;
}
*/
