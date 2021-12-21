package thread;
/**
 *终止一个sleep方法的执行：方式一（对象名.interrupted）
 *      这个方式不好
 *
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.start();

        try {
            Thread.sleep(6000*6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

        System.out.println("睡醒了");
    }
}

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i < 3 ; i++){
            System.out.println("分支线程运行：" + i);
        }
    }
}