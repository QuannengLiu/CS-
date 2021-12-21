package thread;
/**
 *线程的sleep方法
 *static void sleep(long millis)
 *     1、静态方法：Thread.sleep(1000);
 *     2、参数是毫秒
 *     3、作用：让当前线程进入休眠，进入“阻塞状态”，放弃占有CPU时间片，让给其它线程使用。
 *         这行代码出现在A线程中，A线程就会进入休眠。
 *         这行代码出现在B线程中，B线程就会进入休眠。
 *     4、Thread.sleep()方法，可以做到这种效果：
 *         间隔特定的时间，去执行一段特定的代码，每隔多久执行一次。
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.start();
        for(int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main支线程运行：" + i);
        }
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 2; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("分支线程运行：" + i);
        }
    }
}