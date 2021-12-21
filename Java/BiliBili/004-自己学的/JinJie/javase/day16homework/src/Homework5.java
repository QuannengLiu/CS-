public class Homework5 {

    public static void main(String[] args) {

        Person  zhangsan = new Person("张三", 20);
        zhangsan.display();

    }


}

//定义一个类为人
class Person{

    //类的两个私有属性姓名和年龄
    private String name;
    private int age;
//定义无参数构造方法
    public Person() {
    }

    //定义有参数构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//定义私有属性姓名和年龄的getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //定义显示display方法，用于打印姓名和年龄
    public void display(){

        System.out.println("姓名为：" + getName());
        System.out.println("年龄为：" + getAge());

    }
}
