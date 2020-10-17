/*
*  以后可能看不到该对象属于什么
* 这个时候就会用到instanceof方法
*
* */
public class Test02 {
    public static void main(String[] args){
        Animal  x = new Bird();
        Animal  y = new Cat();
        if(x instanceof Bird){
            Bird a1 = (Bird) x;
            a1.sing();
        }else if(x instanceof Cat){
            Cat a1 = (Cat) x;
            a1.catchMouse();
        }
        if(y instanceof Cat){
            Cat a2 = (Cat) y;
            a2.catchMouse();
        }else if(y instanceof Bird){
            Bird a2 = (Bird) y;
            a2.sing();
        }
    }
}
