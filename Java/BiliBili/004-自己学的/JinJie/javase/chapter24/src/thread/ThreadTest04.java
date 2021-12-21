package thread;
/**
 *实现线程的第三种方式：采用匿名内部类的方式
 *      第一步：通过调用构造方法创建线程对象，构造方法中传的接口为当场建的接口，且此接口须重写run方法
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    System.out.println("分支线程运行：" + i);
                }
            }
        });
        //调用start方法，启动分支线程
        t.start();

        //此处for循环执行的是main线程
        for (int i = 0; i < 100; i++){
            System.out.println("main线程运行：" + i);
        }
    }
}
