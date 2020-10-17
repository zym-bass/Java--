/*  1.方法覆盖结合多态机制联合起来才有意义
        因为方法覆盖的要求是不在同一个类中  返回值类型相同 方法名相同 形参相同
        多态是继承演化的不在一个类中
    2.静态方法存在方法覆盖吗？
        静态方法是静态的不在堆内存中，
        在调用时在栈内存中运行不需要创建对象也可以调用
        方法覆盖是对于实例化对象的方法覆盖
        即静态方法不能实现方法覆盖
        私有方法无法覆盖

* */
public class OverrideTest05 {
    //私有方法
    private void doSome(){
        System.out.println("私有方法");
    }

    //入口
    public static void main(String[] args){
        OverrideTest05 c1 = new T();
        //本身私有方法不能被访问，但是目前处在同一个类中可以被访问
        c1.doSome();//私有方法不能被覆盖
    }
}
class T extends OverrideTest05{
    public  void doSome(){
        System.out.println("覆盖");
    }
}

