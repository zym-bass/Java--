
/*
*   思考：实例变量没有手动赋值的时候，实际上系统会默认值
*   那么这个默认赋值操作是在什么时候进行的？
*       不是，实例变量是在构造方法执行的过程中完成初始化的，完成赋值的
*
*
* */
public class User02 {

    //用户id
    int id;

    //用户名
    String name;

    //年龄
    int age;

    //手动定义有参数的构造方法，无参数构造方法将会消失
    public User02(int a){

    }
    public User02(){
        //这里实际上有三行代码你看不见
        //无参数构造方法当中虽然什么代码都没写
        //但是实际上是在这个方法体里面进行的实例变量默认值初始化
        id   = 111 ;
        name = "ef";
        age  = 112 ;
    }

}

