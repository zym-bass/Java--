public class Test01 {
    public static void main(String[] args){
        //创建中国厨师对象
        FoodMenu cooker = new ChinaCook();
        //创建美国厨师对象
        FoodMenu cooker02 = new AmCook();
        //创建顾客对象 并且顾客选择中国厨师做菜
        Client customer = new Client(cooker);//调用有参构造
        //该语句调用Client无参构造
        //Client customer02 = new Client();

        //顾客点菜
        customer.order() ;
        //customer02.order();
    }
}
