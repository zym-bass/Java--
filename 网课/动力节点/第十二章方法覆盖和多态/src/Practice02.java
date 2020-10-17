/*编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
可以弹奏的乐器包括二胡、钢琴和琵琶。
实现思路及关键代码:
1)定义乐器类Instrument,包括方法makeSound ()
2)定义乐器类的子类:二胡Erhu、 钢琴Piano和小提琴violin
3)定义乐手类Musician,可以弹奏各种乐器play (Instrunent i)
4)定义测试类，给乐手不同的乐器让他弹奏
* */
public class Practice02 {
    public static void main(String[] args){

        //创建乐手对象
        Musician  ren = new Musician();

        //创建二胡对象
        Erhu er = new Erhu();
        ren.play(er);

        //创建小提琴对象
        Violin vi = new Violin();
        ren.play(vi);

        /*//一个乐手只能用一个乐器
        Erhu er = new Erhu();
        Musician  ren = new Musician(er);
        ren.play();

        Violin vi = new Violin();
        Musician  ren02 = new Musician(vi);
        ren02.play();*/

    }
}
class Musician {
    public void play(Instrument ins){
        ins.makeSound();
    }
}
/*
public class Musician {
    //实例变量
    Instrument i ;
    //无参构造
    public Musician(){

    }
    //有参构造
    public Musician(Instrument i ){
        this.i = i ;
    }
    //乐手演奏方法
    public void play(){
        i.makeSound();
    }

}*/
//乐器
 class Instrument {
    public void makeSound(){
    }
}

 class Erhu extends Instrument{
    public void makeSound(){
        System.out.println("二胡演唱");
    }
}


 class Violin extends Instrument{
    public void makeSound(){
        System.out.println("小提琴演唱");
    }
}

