
/*
*   此方法一般都是描述了一个行为，如果说该行为必须由对象去触发。
*   那该方法是一个对象方法
*
*   类 = 属性 + 方法
*   属性描述的是：状态
*   方法描述的是：行为动作
*   如果是工具类的，工具类当中的方法，一般都是静态的。
*   静态方法优点不需要new对象可以直接使用
*
*
*
* */
public class StaticTest05 {
    public static void main(String[] args){
        User05 u = new User05();
        System.out.println(u.getId());
        u.setId(100);
        System.out.println(u.getId());
    }
}

class User05{
    private int id ;

    public  void setId(int i ){
        id = i;
    }
    public  int  getId(){
        return id;
    }
}