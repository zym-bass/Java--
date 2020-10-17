//方法覆盖经典案例
//方法覆盖或者重写的时候 建议使用copy
public class OverrideTest03 {
    public static void main(String[] args){
        //创建中国人对象
        ChinaPeople  a = new ChinaPeople();
        a.setName("张三");
        a.speak();
        //创建美国人对象
        AmericPeople s = new AmericPeople();
        s.setName("EsgGE");
        s.speak();

    }
}
//人
class People{
    //属性
    private String name ;
    //构造
    public People(){}
    public People(String name){
        this.name = name;
    }

    //set and get
    public void setName(String name ){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //人都会说话
    public void speak (){
        System.out.println(name+"......");
    }
}
class ChinaPeople extends People{
    //中国人说话是汉语
    public void speak(){
        System.out.println(this.getName()+"正在说汉语");
    }

}
class AmericPeople extends People {

    //美国人说的是英语
    public void speak(){
        System.out.println(this.getName()+" speak English");
    }
}
