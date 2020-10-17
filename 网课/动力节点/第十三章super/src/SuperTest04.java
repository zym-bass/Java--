
/*
    在父和子中有同名的属性，或者说有相同的方法
    如果此时想在子类中访问父中的数据，必须使用“super.”加以区分

    super.属性名 【访问父类的属性】
    super.方法名(实参) 【访问父类的方法】
    super.(实参) 【访问父类的构造方法】
*/
public class SuperTest04 {
    public static void main(String[] args ){
        Cat c = new Cat();
        c.yiDong();
    }
}
class Animal04{
    public void move(){
        System.out.println("Animal move!");
    }
}
class Cat extends Animal04 {
    public void move(){
        System.out.println("Cat move!");
    }
    public void yiDong(){
        this.move();
        move();
        super.move();
    }
}
