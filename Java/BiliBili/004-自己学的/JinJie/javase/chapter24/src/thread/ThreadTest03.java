package thread;
/**
 *实现线程的第二种方式
 *      第一步：编写一个线程类实现java.lang.Runnable接口
 *      第二步：重写这个线程类的run方法
 *      第二步：创建接口对象
 *      第三步：利用构造方方法创建线程对象，构造方法中传新建的接口对象（把接口对象封装成线程对象）
 *      第四步：利用start方法启动线程
 *      注意：第二种方式实现接口比较常用，因为一个类实现了接口，它还可以去继承其它的类，更灵活。
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        //创建接口对象
        MyRunnable r = new MyRunnable();
        //把接口对象封装成线程对象
        Thread t = new Thread(r);
        //启动线程
        t.start();

        //这个for循环，mian线程运行
        for (int i = 0; i < 100; i++){
            System.out.println("main线程运行：" + i);
        }

    }
}

//编写一个类实现java.lang.Runnable接口
class MyRunnable implements Runnable{
    //这个for循环，分支线程运行
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("分支线程运行：" + i);
        }
    }
}