package thread;
/**
 *学习线程的几个方法：获取当前线程对象，获取线程对象的名字，修改线程对象的名字
 * 方法一：获取当前线程对象Thread.currentThread();
 * 方法二：获取线程对象的名字（线程对象.getName()），默认名字为Thread-0、Thread-1、Thread-2
 * 方法三：修改线程对象的名字（线程对象.setName(字符串格式的新的名字)）
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Thread t = new MyThread2();
        t.start();
        for (int i =0; i < 3 ; i++){
            System.out.println("main线程运行：" + i);
        }
        //获取当前线程对象
        System.out.println(Thread.currentThread());
        //获取当前线程对象的名字
        System.out.println(t.getName());
        //修改当前线程对象的名字
       t.setName("重新修改后的对象名字");
        //获取当前线程对象的名字
        System.out.println(t.getName());
    }
}

class MyThread2 extends Thread{
    //重写run方法
    @Override
    public void run() {
        for (int i =0; i < 3 ; i++){
            System.out.println("分支线程运行：" + i);
        }
    }
}