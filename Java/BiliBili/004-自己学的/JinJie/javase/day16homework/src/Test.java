public class Test {

    //测试交通工具类

    public static void main(String[] args) {

        //创建一个交通工具
        Vehicle v1 = new Vehicle();

        //初始化汽车速度为30km/h

        v1.setSpeed(30);
        System.out.println("汽车初始速度是：" + v1.getSpeed());

        //设置汽车体积
        v1.size = 5;
        System.out.println("汽车初始体积是：" + v1.size);

        //改变汽车速度:加速
        v1.speedUp(v1.getSpeed());
//        System.out.println("汽车加速后速度是：" + v1.speedUp(v1.getSpeed()));

        //改变汽车速度:加速
        v1.speedDown(v1.getSpeed());
//        System.out.println("汽车减速后速度是：" + v1.speedDown(v1.getSpeed()));

    }

}
