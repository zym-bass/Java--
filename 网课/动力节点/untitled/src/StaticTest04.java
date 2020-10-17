public class StaticTest04 {

    public static void main(String[] args){
        StaticTest04 s = new StaticTest04();
        doSome();

        //对象级别方法
        //s = null; 空指针异常
        s.doOther();
    }

    //静态方法（静态方法不需要new 对象，直接使用“类名”来访问）
    public static void doSome(){
        System.out.println("静态方法doSome");
    }

    //实例方法（实例相关的都需要new对象，使用“引用”来访问）
    public void doOther(){
        System.out.println("实例方法doOther!");
    }
}
