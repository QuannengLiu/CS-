/*
继承与接口同时出现时怎么办？
 */

public class Test04 {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.fly();

//        Animal c2 = new Cat();
//        c2.fly();

//        多态
        Flyable c2 = new Cat();
        c2.fly();

//没有翅膀不能飞
/*      Flyable s1 = new Snake();
        s1.fly();
*/

        Flyable p1 = new Pig();
        p1.fly();

    }
}

//动物类
class Animal {


}

//可飞翔的接口
interface Flyable{

    void fly();

}

//动物类的子类猫
class Cat extends Animal implements Flyable{

    @Override
    public void fly() {

        System.out.println("猫儿在飞翔");

    }
}

class Snake extends Animal{



}

class Pig extends Animal implements Flyable{

    public void fly(){

        System.out.println("猪在飞翔");

    }

}
