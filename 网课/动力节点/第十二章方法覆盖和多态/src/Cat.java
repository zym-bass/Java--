public class Cat extends Animal {
    public void move(){
        System.out.println("猫在跑");
    }
    //猫除了move之外，应该有自己特有的行为，例如抓老鼠
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
