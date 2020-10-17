/*


// 什么时候变量声明为实例的，什么时候声明为静态的？


public class StaticTest02 {
    public static void main(String[] args){
        Chinese c1 = new Chinese("12323","张三","中国");
        Chinese c2 = new Chinese("12322","李四","中国");

    }
}

//定义一个类，中国人
class Chinese{
    //身份证号
    //每一个人的身份证不同，一个对象一个
    String idCard;
    //姓名
    String name;
    //对于中国人 这个不会变 所以可以是静态变量
    //国籍
     String contry;

     //无参数的构造方法
    public Chinese(){

    }

    //有参数的构造方法
    public Chinese(String s1 , String s2,String s3){
        idCard = s1;
        name = s2;
        contry = s3;

    }
}
*/

/*实例的，一定需要使用“引用”，来访问
*静态的：
*   建议使用“类名”来访问，但使用“引用”，也行（不建议使用“引用”）
*   静态的如果使用“引用”，来访问会让程序员产生困惑，程序员以为是实例变量呢
*
* 结论：
*   空指针异常只有在访问实例相关的，都会出现空指针异常
* */
public class StaticTest02 {
    public static void main(String[] args){
        Chinese c1 = new Chinese("12323","张三");
        System.out.println(c1.idCard);
        System.out.println(c1.name);
        System.out.println(Chinese.contry);
        Chinese c2 = new Chinese("12322","李四");
        System.out.println(c2.idCard);
        System.out.println(c2.name);
        System.out.println(Chinese.contry);
        System.out.println(c2.contry);
        //c2是空引用
        c2 = null;
        //分析这里会不会出现空指针异常？
        //不会出现空指针异常
        //因为静态变量不需要对象的存在
        //实际上以下代码在运行的时候，还是System.out.println(c2.contry);
        System.out.println(c2.contry);
        //如果访问对象会出现空指针异常

    }
}

//定义一个类，中国人
class Chinese{
    //身份证号
    //每一个人的身份证不同，一个对象一个
    String idCard;
    //姓名
    String name;
    //对于中国人 这个不会变 所以可以是静态变量
    //国籍
    //重点，加static的变量叫做静态变量
    //静态变量在类加载时初始化，不需要new对象，静态变量的空间就开出来了。
    //静态变量存储在方法区

    static String contry ="中国" ;

    //无参数的构造方法
    public Chinese(){

    }

    //有参数的构造方法
    public  Chinese(String s1 , String s2){
        idCard = s1;
        name = s2;

    }
}