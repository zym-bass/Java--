public class Vip {
    //会员号
    long no;
    //会员姓名
    String name;
    //生日
    String birth;
    //性别
    String scx;
    //一个类中当没有写任何的构造方法，系统会有缺省构造器来对实例变量赋初始值
    //如果手动写出无参数，则系统无参数则被顶掉
    //实例变量


    public Vip(){


    }
    public Vip(long huiYuanHao , String xingMing){
        //给实例变量赋值
        no   = huiYuanHao;
        name = xingMing;
    }

    public Vip(long huiYuanHao , String xingMing ,String xingBie){
        no = huiYuanHao;
        name = xingMing ;
        scx  = xingBie  ;
    }



}
