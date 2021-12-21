//定义一个交通工具类

public class Vehicle {

    //定义速度类
    private int speed;

    //定义体积类
    int size;

    //定义方法移动
    public void move (){

        System.out.println("汽车在移动");

    }

    //设置速度
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //定义方法加速
    public int speedUp(int speed){

        this.speed = speed + 10;
        System.out.println("汽车加速至：" + this.speed );
        return this.speed;

    }
    //定义方法减速
    public int speedDown(int speed){

        this.speed = speed - 10;
        System.out.println("汽车减速至：" + this.speed );
        return this.speed;

    }

}
