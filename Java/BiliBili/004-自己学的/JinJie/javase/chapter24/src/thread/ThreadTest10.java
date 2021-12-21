package thread;
/**
 *终止一个sleep方法的执行：正确方式
 *      在run方法中加入true和false方法
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(r);
        t.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
        System.out.println("睡醒了");
    }
}

class MyRunnable4 implements Runnable{
    //打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 6; i++){

            if(run = true){
                System.out.println("分支线程执行：" + i);
                try {
                    Thread.sleep(6*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{

                //此处用于返回需要保存的值
                return;
            }

        }
    }
}