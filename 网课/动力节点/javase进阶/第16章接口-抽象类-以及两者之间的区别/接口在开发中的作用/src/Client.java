public class Client {
    private FoodMenu foodMenu ;//面向接口
    //构造方法
    public Client(){

    }
    public Client(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //set and get
    public FoodMenu getFoodMenu() {
            return foodMenu;
    }
    public void setFoodMenu(FoodMenu foodMenu) {
            this.foodMenu = foodMenu;
    }

    //点菜方法
    public void order(){
        //点菜得拿菜单
        foodMenu.xihongshi();
        foodMenu.yuxiang();
    }

}
