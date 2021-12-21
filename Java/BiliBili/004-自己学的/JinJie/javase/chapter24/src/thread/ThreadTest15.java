package thread;

import com.sun.org.omg.CORBA.RepositoryHelper;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *实现线程的第三种方式：实现Callable接口
 *      1、实现方式
 *             第一步：新建一个类A实现Callable接口
 *             第二步：在第一步新建的类A中实现call方法（类似于其他实现线程方式中的重新run方法）
 *             第三步：创建一个“未来任务类”对象B，FutureTask 未来任务类对象名 = new FutureRask(新建一个第一步创建的类的对象A);
 *             第四步：创建线程对象C，Thread = new Thread(未来任务类对象名B);
 *             第五步：启动线程
 *      2、特点：可以在其他线程A中得到利用这种方法得到的线程B运行的返回值，返回值类型为obj，但A会停止让B线程插队运行完后再运行，效率较低
 *
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class ThreadTest15 {
    public static void main(String[] args) {
        //新建一个FutureTask类
        FutureTask futureTask = new FutureTask(new MyCallable());

        //创建线程对象
        Thread t = new Thread(futureTask);
        //启动线程
        t.start();

        Object obj = null;
        try {
            obj = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("在主线程中得到的分支线程执行结果：" + obj);
        for (int i = 0; i < 100; i++){
            System.out.println("主线程执行" + i);
        }
    }
}

class MyCallable implements Callable{
    @Override
    public Object call() throws Exception {
        //模拟线程的执行
        //表示一下call方法的执行
        System.out.println("call method begin");
        Thread.sleep(3000);
        System.out.println("call method over");
        //随便返回一个值,这里的int类型会自动装箱变成Interger
        return 1+1;
    }
}