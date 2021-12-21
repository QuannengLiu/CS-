package thread;
/**
 *实习线程的第一种方式
 *      第一步：编写一个线程类继承java.lang.Thread方法
 *      第二步：重写这个新建的线程类中的run方法
 *      第三步：new新建的这个线程类对象
 *      第四步：启动线程
 * @author QUANNENG LIU
 * @Date 2021/12/10
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        //这个for循环运行在main线程中
        for (int i = 0; i < 100; i++){
            System.out.println("main线程执行：" + i);
        }
    }
}

//编写的一个线程类
class MyThread extends Thread{
    @Override
    public void run() {
        //这个for循环运行在分支线程中
        for (int i = 0; i < 100; i++){
            System.out.println("分支线程执行：" + i);
        }
    }


/*    public void Test(){
        for (int i = 0; i < 100; i++){
            System.out.println("分支线程执行：" + i);
        }

    }*/


}