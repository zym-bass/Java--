public class Test01 {
    //静态变量
    static Student stu = new Student();

    //入门
    public static void main (String[] args){
        Test01.stu.exam();
        System.out.println("Helloworld");
    }
}
class Student {
    //实例方法
    public void exam(){
        System.out.println("考试.....");
    }
}