/*
* 除了静态代码块之外，还有一种语句块叫做，实例语句块
* 实例语句在类加载是并没有执行
* 实例语句块｛
*   Java语句：
*   Java语句；
*   Java语句：
*
* ｝
* 实例语句块在什么时候执行？
* 只要是构造方法执行，必然在构造方法执行之前，自动执行“实例语句块”中的代码。
* 对象构建构建时机
* */
public class InstanceCode {

    public static void main(String[ ]  args){
        System.out.println("mian ");
        //InstanceCode p = new InstanceCode(123);
        new InstanceCode();
        new InstanceCode(123);


    }
    //实例语句块
    {
        System.out.println("instance");
    }

    static{
        System.out.println("Static");
    }
    public InstanceCode(){
        System.out.println("无参数的构造方法");
    }
    public InstanceCode(int i){
        System.out.println("有参数的构造方法");
    }

}