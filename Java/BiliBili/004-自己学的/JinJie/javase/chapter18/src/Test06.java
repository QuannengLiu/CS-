/*
关于object中的finalize方法
 */

public class Test06 {

    public static void main(String[] args) {
/*        //创建对象
        Person p = new Person();

        p = null;*/

        for (int i = 0; i < 1000 ; i++){

            //创建对象
            Person p = new Person();

            p = null;

            //建议垃圾回收
            if (i%50 == 0){
                System.gc();
            }

        }

    }

}

//    //finalize源代码
//    protected void finalize() throws Throwable { }

class Person{
    //重写finalize代码
    protected void finalize() throws Throwable {

        System.out.println(this + "即将被销毁");

    }

}
