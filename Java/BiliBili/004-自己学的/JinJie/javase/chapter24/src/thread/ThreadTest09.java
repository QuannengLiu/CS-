package thread;
/**
 *终止一个sleep方法的执行：方式二（对象名.stop）
 *      这个方式不好，容易丢失数据
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.start();


        for (int i = 0; i < 6; i++){
            System.out.println("main线程执行：" + i);

        }

        t.stop();
        System.out.println("睡醒了");

    }
}

class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 6; i++){
            System.out.println("分支线程执行：" + i);

        }
    }
}