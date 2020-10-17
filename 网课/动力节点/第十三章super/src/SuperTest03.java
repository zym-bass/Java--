
/*
    super 不是引用，super也不保存内存地址，super也不指向任何对象
    super 只是代表当前对象内部的那一块父类的特征

*/
public class SuperTest03  {

    public void doSome(){
        //SuperTest03@1540e19d
        System.out.println(this);
        //System.out.println(this.toString());
        //输出 “引用”的时候，会自动调用引用的toString()方法。

        //编译错误，需要“.”
        //System.out.println(super);
        //
    }
   /* public static void doOther(){
        //System.out.println(this);
    }*/
    //静态方法，主方法
    public static void main(String[] args){
        SuperTest03 s = new SuperTest03();
        s.doSome();
    }

}
