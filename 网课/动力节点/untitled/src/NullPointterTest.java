
/*
* 空指针异常导致的最本质的原因是？
*   空引用访问“实例相关的数据”，会出现空指针异常
*
* 实例相关的方法：实例变量，实例方法
* */
public class NullPointterTest {
    public static void main(String[] args){
        //创建实例变量
        User p = new User();
        System.out.println(p.id);
        p.doSome();
        //引用变成空
        p = null;
        p.doSome();

    }

}
//类 = 属性+方法
//属性描述状态
//方法描述行为动作
class User{
    //实例变量
    int id ;
    //实例方法

    //
    public void doSome(){
        System.out.println("do some");
    }
}
