/*
public class Test {
    public static void main(String[] args) {
        //家庭住址对象
        Address a = new Address();
        a.city = "北京";
        a.street = "大兴区";
        a.zipcode = "121221";

        //用户对象
        User s = new User();
        s.id = 1000000;
        s.username = "zym";
        s.addr = a;//像 a=100;//100就是一个address类型对象
        //传输的是地址 原先s.addr是null
        // 赋值之后 s.addr的值地址 与a的值地址相同
        // 即改变a.city 还是改变s.addr.city都是改变同一个对象
        System.out.println(s.addr.city);
        a.city = "山西";
        System.out.println(s.addr.city);
        s.addr.city = "北京";
        System.out.println(a.city);
        System.out.println(a.toString());
        System.out.println(s.addr.toString());
        //两地址相同
    }
}*/
