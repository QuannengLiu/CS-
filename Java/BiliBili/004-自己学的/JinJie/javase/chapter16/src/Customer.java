public class Customer {


//    顾客属性
    private FoodMenu foodMenu;


//    养成写set和get方法的习惯
    public Customer() {
    }

    public Customer(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

//    方法：顾客点菜

    public void order(){

        this.getFoodMenu();

        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();




    }


}
