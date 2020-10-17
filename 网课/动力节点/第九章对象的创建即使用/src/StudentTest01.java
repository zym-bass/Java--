/*
/对象的创建和使用/
*/

/*
public class StudentTest01 {
    public static void main(String[] args){
     */
/*   创建类对象的语法： new 类名（）
     /*   new 是个运算符 ，专门负责对象的创建
         p 是一个变量名
           Student01 是数据类型 （为引用数据类型）
           new Student01(); 这是一个对象
        * *//*

        //p属于局部变量 在方法体内声明的变量都是局部变量
        Student p = new Student();//引用数据类型
        //像p这种保存类对象地址的变量，有一个特殊的名字叫引用。
        //p这个局部变量叫做引用
        //对象是通过new 出来的 ，在堆内存存储
        // new Student() 是new出来的对象在堆内存存储，堆内存中this对象的内存地址通过=赋值给了p，即p得到了堆内存的地址，即可对其实例变量进行修改叫做引用
        //System.out.println(Student.name);//不能直接访问实例变量
        //访问实例变量，引用.实例变量名;
        System.out.println("p对象姓名:"+p.name);
        System.out.println("p对象学号:"+p.no);
        p.name="zym";
        p.no  =2017070342;
        System.out.println("p对象姓名:"+p.name);
        System.out.println("p对象学号:"+p.no);
    }
    public static void method(){

    }
}
*/
