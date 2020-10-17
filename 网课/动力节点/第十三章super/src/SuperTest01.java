/*
    1.super是一个关键字
    2.this和super
        this:
            this能出现在实例方法中和构造方法中，
            this的语法是“this.”"this()"
            this不能使用在静态方法中
            this.大部分情况下是可以省略的
            this.什么时候不能省略呢？在区分局部变量和实例变量的时候不能省略
                public void setName(String name){
                    this.name = name;
                }
                this()只能出现在构造方法第一行，通过当前的构造方法去调用“本类”中
                其他的构造方法，目的是，代码复用。
        super:
            super能出现在实例方法中和构造方法中，
            super的语法是“super.”"super()"
            super不能使用在静态方法中
            super.大部分情况下是可以省略的
            super.什么时候不能省略呢？


            super()只能出现在构造方法第一行，通过当前的构造方法去调用“父类”中
            的构造方法，目的是，创建了类对象的时候，先初始化父类型特征。
     3. super()
        表示通过子类的构造方法调用父类的构造方法
        模拟现实世界的这种场景，要想有儿子，就先有父亲
     4.重要的结论：
        当一个构造方法第一行：
            没有this()又没有super()的话，默认会有一个super()
            表示通过当前子类的构造方法调用父类的无参数构造方法
        当父类没有无参构造方法，但是有其他有参构造方法时，
        若需求希望如此，这在子类构造方法中第一行super（）内的形参与父类构造方法的形参类型相同

        同理，若子类想调用父类其他数据类型的有参数构造方法时
        可以使用super（数据类型变量值）调用父类相对应的构造参数
        this() super() 不能共存
 */

public class SuperTest01 {
    public static void main(String[] args){
        //创建子类对象
        new B();
    }
}
class A {
    public A (){

        System.out.println("A类无参数构造");
    }
    public A(int i){
        System.out.println("A类int参数构造");
    }
    public A(double i){
        System.out.println("A类double参数构造");
    }

}

class B extends A{
    public B(){
        super(123.23);//在子类构造方法中super会自动生成，并与父类构造方法匹配
        System.out.println("B类中的无参构造方法");
    }
    public B(int i){
        this(10,10);
        System.out.println("B类中的int 参构造方法");
    }
    public B(int i, int j){
        System.out.println("B类中的int int 参构造方法");
    }
}