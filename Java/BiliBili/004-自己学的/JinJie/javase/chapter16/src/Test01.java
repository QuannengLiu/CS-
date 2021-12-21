public class Test01 {
    public static void main(String[] args) {

        MyMath m1 = new abc();

    }
}

interface MyMath{

    double PI = 3.14159265;
    int sum(int a, int b);
    int sub(int a, int b);

}

//编写一个非抽象类

//修正方法一：重现接口中的抽象方法
/*
class abc implements MyMath{

    public void sum(){
        System.out.println("测试");

    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }
}*/

/*//修正方法二：把非抽象类改成抽象类
abstract class abc implements MyMath{


}*/

class abc implements MyMath{

    @Override
    public int sum(int a, int b) {
        return 0;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }
}