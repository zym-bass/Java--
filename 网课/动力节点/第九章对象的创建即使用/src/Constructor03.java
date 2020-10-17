public class Constructor03 {
    public static void main(String[] args){
        Vip p1 = new Vip();
        System.out.println(p1.scx);
        System.out.println(p1.name);
        System.out.println(p1.birth);
        System.out.println(p1.no);

        Vip p2 = new Vip(132131,"wewf");
        System.out.println(p2.scx);
        System.out.println(p2.name);
        System.out.println(p2.birth);
        System.out.println(p2.no);

        Vip p3 = new Vip(123133,"zym","男");
        System.out.println(p3.scx);
        System.out.println(p3.name);
        System.out.println(p3.birth);
        System.out.println(p3.no);

    }
}
