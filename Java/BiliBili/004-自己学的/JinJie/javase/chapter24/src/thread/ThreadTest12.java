package thread;
/**
 *线程让位，当前线程暂停回到就绪状态，让给其他线程
 *      实现方法(静态方法)：Thread.yield
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest12 {
    public static void main(String[] args) {
        Thread r = new Thread(new MyRunnable6());
        r.start();
        for (int i = 0; i < 100; i++){
            System.out.println("main支线程执行" + i);
        }
    }
}

class MyRunnable6 implements Runnable{
    @Override
    public void run() {
       for (int i = 0; i < 100; i++){
           //每十步分支方法yield一次，让给主方法执行
           if (i % 10 == 0){
               Thread.yield();
           }
           System.out.println("分支线程执行" + i);
       }
    }
}