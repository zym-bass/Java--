public class PersonTest02 {
    public static void main(String[] args){
        //创建对象
        Person p1 = new Person();

     /*   //Person 的age,彻底在外部不能访问啦，但是这太安全啦，完全没球用
         //该age属性的值
        System.out.println(p1.age);*/
        //修改 age
        //System.out.println(p1.get);
        p1.setAge(100);
        System.out.println(p1.getAge());
    }
}
