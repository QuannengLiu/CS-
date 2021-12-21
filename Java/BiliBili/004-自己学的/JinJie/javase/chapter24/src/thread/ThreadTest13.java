package thread;
/**
 *线程合并：若插队线程A合并到当前线程B中，则当前线程B停止工作，插队线程A运行结束后当前线程B再工作(类似于插队线程A插队)
 *      实现方法：插队线程A.join（）
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest13 {
    public static void main(String[] args) {
        Thread r = new Thread(new MyRunnable7());
        r.start();

        for (int i = 0; i < 100; i++){
            if (i > 50){
                try {
                    r.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main线程执行" + i);
        }

        //插队线程A插队，当前线程B气坏


        System.out.println("main over");
    }
}

class MyRunnable7 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println("分支线程执行" + i);
        }
    }
}
