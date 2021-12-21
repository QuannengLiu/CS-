package thread;
/**
 *守护线程
 * 		1、java语言中线程分为两大类：
 * 			一类是：用户线程，如主线程main方法
 * 			一类是：守护线程（后台线程），如垃圾回收线程
 * 		2、守护线程的特点：
 * 			一般守护线程是一个死循环，所有的用户线程只要结束，
 * 			守护线程自动结束。
 * 		3、守护线程用在什么地方呢？
 * 			每天00:00的时候系统数据自动备份。
 * 			这个需要使用到定时器，并且我们可以将定时器设置为守护线程。
 * 			一直在那里看着，每到00:00的时候就备份一次。所有的用户线程
 * 			如果结束了，守护线程自动退出，没有必要进行数据备份了。
 * 		4、实现方式：
 * 	        线程对象.setDaemon(true);
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("备份数据的线程");

        //启动线程之前，将其设置为守护线程
        t.setDaemon(true);

        t.start();

        //主线程：主线程是用户线程
        for (int i = 0; i < 30; i++){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        //即使是死循环，但由于该线程是守护线程，所以当用户线程结束，守护线程也结束
        while (true){
            System.out.println(Thread.currentThread().getName() + "----->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}