//分析程序的输出结果

public class Test1 {
    public static void main(String[]  args){

        int i = 10;
        int y= i;//x赋值给y，是怎么传递的？
        int x=100;
        add(i);
        System.out.println("main---->"+i);
    }

    public static void add(int i ){

        i++;
        System.out.println("add---->"+i);

    }

}