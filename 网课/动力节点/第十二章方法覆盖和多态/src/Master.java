/*public class Master {
    public void feed (int x){
        Pet a = new  Pet();
        switch(x){
        case 1:
            Pet a1 = new Dog();
            a1.eat();
            break;
        case 2:
            Pet a2 = new Cat02();
            a2.eat();
            break;
        case 3:
            Pet a3 = new YingWu();
            break;

        }
    }
}*/
/*
public class Master{
    public void feet(Dog d){
        d.eat();
    }
    public void feet(Cat02 c){
        c.eat();
    }
}*/
//能不能让Mater主人这个类以后不再修改了
//即使主人又喜欢其它宠物了，Master也不需要修改
//这个时候就需要使用，多条机制
//最后不要写具体的宠物类型，这样会影响程序的扩展性
public class Master{
    public void feed(Pet pet){ // Pet pet =  new Cat02();
        pet.eat();
    }
}