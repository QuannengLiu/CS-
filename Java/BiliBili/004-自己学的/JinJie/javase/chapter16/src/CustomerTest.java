public class CustomerTest {

    public static void main(String[] args) {
//创建厨师对象

        FoodMenu cooker1 = new ChineseCooker();
        FoodMenu cooker2 = new AmerciaCooker();

        Customer customer = new Customer(cooker1);
        customer.order();

        Customer customer2 = new Customer(cooker2);
        customer2.order();
    }

}
