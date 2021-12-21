package thread;

import java.util.ArrayList;
import java.util.List;

/**
 *生产者消费者模式
 * 1、使用wait方法和notify方法实现“生产者和消费者模式”
 * 2、什么是“生产者和消费者模式”？
 *     生产线程负责生产，消费线程负责消费。
 *     生产线程和消费线程要达到均衡。
 *     这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notify方法。
 * 5、wait方法作用：o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁。
 * 6、notify方法作用：o.notify()让正在o对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁。
 * 7、模拟这样一个需求：
 *     仓库我们采用List集合。
 *     List集合中假设只能存储1个元素。
 *     1个元素就表示仓库满了。
 *     如果List集合中元素个数是0，就表示仓库空了。
 *     保证List集合中永远都是最多存储1个元素。
 *
 *     必须做到这种效果：生产1个消费1个。
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class ThreadTest16 {
    public static void main(String[] args) {
        //新建一个共享的list
        List list = new ArrayList();
        //创建生产者线程对象
        Thread t1 = new Thread(new Producer(list));
        //创建消费者线程对象
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}

//新建生产者线程
class Producer implements Runnable{
    //仓库
    private List list;
    public Producer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        //通过死循环来模拟一直生产
        while (true){
            //给仓库对象list加锁
            synchronized (list){
                //大于0，说明仓库中已经有一个元素了，仓库满了停止生产
                if (list.size() > 0){
                    try {
                        //当前线程进入等待状态，并释放Producer之前占有的list集合的锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果可以运行到这里，表示仓库中没有元素，则开始生产
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "----->" + obj);
                //唤醒消费者进行消费
                list.notify();
            }
        }
    }
}

//新建消费者线程
class Consumer implements Runnable{
    //新建仓库
    private List list;
    public Consumer(List list) {
        this.list = list;
    }
    @Override
    public void run() {
        while (true) {
            //仓库中有0个元素，说明仓库已经满了，需要停止消费
            synchronized (list){
            if(list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            //如果可以运行到这里，表示仓库满了，需要消费
            //通过删除来模拟消费
            Object obj = list.remove(0);
            System.out.println(Thread.currentThread().getName() + "----->" + obj);
            //此时唤醒生产者生产
            list.notify();
            }
        }
    }
}