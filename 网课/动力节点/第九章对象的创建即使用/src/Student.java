 public class Student {
    int no;
    String name;
    int age;
    //构造方法是用来创建对象的，并且初始化实例对象
    public Student(){
        System.out.println("无参数构造方法执行啦");
    }

    public Student(int i){
        System.out.println(i);
    }
    public Student(double  x){
        no   = 10;
        name = "zgg";
        age  = 100;

    }

    //当没有返回值的时候，编译器默为构造函数，但构造函数要求方法名与类名相同
    // 程序报错
/*    public student(){
        System.out.println("失败案例");
    }*/
}
