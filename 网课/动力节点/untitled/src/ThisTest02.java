/*
* this可以使用在实例方法中，不能使用在静态方法中
* this关键字大部分情况可以省略，什么时候不能省略
* 一个构造方法里可以通过this(另一个参数的构造方法的参数使用)即通过this 调用另一个构造方法
* */

public class ThisTest02 {
    public static void main(String[] args){
        Student02 s = new Student02("wjw",321);
        System.out.println("姓名："+s.getName());
        System.out.println("学号："+s.getNumber());
        s.setName("zym");
        System.out.println("姓名："+s.getName());
        s.setNumber(123);
        System.out.println("学号："+s.getNumber());
        s.dotail();
    }
}
//学生类
class Student02{
    //姓名
    private String name ;
    //学号
    private int  number;
    //无参构造方法
    public Student02(){
        this("123",001);
    }
    //有参构造方法
    public Student02(String name , int number){
        this.name = name;
        this.number = number;
    }
    //setter and getter 方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void setNumber (int number){
        this.number = number;
    }
    public int getNumber (){
        return number;
    }

    //打印
    public void dotail(){
        System.out.println("姓名："+name+" 学号："+number);
    }

}
