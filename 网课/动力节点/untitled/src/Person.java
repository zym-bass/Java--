/*
* Person表示人类
*   每一个人都有年龄这样的属性
*   年龄 age  int 类型
*   先不使用封装
* */
//这个是没有封装的Person
/*
public class Person {
    //实例变量 （属性）
    int age;//age属性是暴露的，在外部程序中可以随意访问，导致了不安全
}
*/
//尝试封装一下
//不对外暴露复杂的数据
//优点：第一数据安全了，第二调用者也方便了
public class Person {
    //private 表示私有的，就是这个关键字修饰之后，
    // 该数据只能在本类中访问,出来这个类就不能使用啦
    //
    private int age;

    //对外提供简单的访问入口
    //对外程序只能通过调整以下代码来完成访问
    //

    //Java开发规范中有要求，set方法和get方法要满足一下格式
    //  get方法的要求：
    //  public 返回值类型  get+属性名首字母大写（无参）｛
    //      return XXX;
    //  ｝
    //
    //  set方法的要求：
    //  public void set+属性名首字母大写（无参）｛
    //      XXX = 参数；
    //
    //   ｝
    //
    //get方法
    public int getAge(){

        return age;
    }

    //set方法
    public void setAge(int nianling){
        //能不能设置关卡
        if(nianling<0||nianling>100) {
            System.out.println("您输入的年龄不符合规则，请重新输入");
            return ;
        }else{
            age = nianling;
        }
    }
}