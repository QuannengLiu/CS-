package threadsafe;
/**
 *学习synchronized
 *      1、synchronized用于保证线程安全
 *      2、synchronized通过线程共享对象来保证线程安全，不同线程同时只能有一个线程修改这个线程对象，线程共享对象的选取很重要
 *      3、什么时候数据在多线程并发的环境下会存在安全问题呢？三个条件：
     * 			条件1：多线程并发。
     * 			条件2：有共享数据。
     * 			条件3：共享数据有修改的行为。
 * 		4、Java中有三大变量(实例变量：在堆中，静态变量：在方法区，局部变量：在栈中。)
 *              局部变量+常量：不会有线程安全问题。
 *              成员变量：可能会有线程安全问题。
 *      5、synchronized有三种写法：
         *      第一种：同步代码块
         * 			灵活
         * 			synchronized(线程共享对象){
         * 				同步代码块;
         *                        }
 *
         * 		第二种：在实例方法上使用synchronized
         * 			缺点1：共享对象一定是this，方式不灵活
 * 		            缺点2：	整个方法体都需要同步，导致程序的执行效率降低。所以这种方式不常用。
 *
         * 		第三种：在静态方法上使用synchronized
         * 			表示找类锁。
         * 			类锁永远只有1把。
         * 			就算创建了100个对象，那类锁也只有一把。
 *
         * 		对象锁：1个对象1把锁，100个对象100把锁。
         * 		类锁：100个对象，也可能只是1把类锁。
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class Test {
    public static void main(String[] args) {
        //新建一个账户对象
        Account act = new Account("act-123",100000);
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
