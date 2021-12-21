public class Test03 {

    public static void main(String[] args) {

        B b = new D();
        C c = new D();
        E e = new D();
        b.m2 ( );
//       b3.m3();不能通过须向下转型，两个没有关系的接口也可以相互转换
        C b2 = (C) b;

        b2.m3();

    }


}

interface E{

    void m1();

}
interface B{

    void m2();

}
interface C{

    void m3();

}

//类与类之间不能多继承，接口间可以多继承，一个类可以支撑多继承吗？可以
class D implements E, B, C{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}
