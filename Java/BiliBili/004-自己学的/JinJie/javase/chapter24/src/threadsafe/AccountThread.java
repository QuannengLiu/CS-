package threadsafe;
/**
 *创建一个线程同步的对象
 *
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class AccountThread extends Account{
    //创建账户类
    private Account act;
    //创建无参构造方法
    public AccountThread() {
    }
    //创建有参构造方法
    public AccountThread(Account act) {
        this.act = act;
    }

    //设置set方法
    public Account getAct() {
        return act;
    }
    //设置get方法
    public void setAct(Account act) {
        this.act = act;
    }

    //利用run方法来表示执行取款动作
    @Override
    public void run(){
        //默认取款5000元
        double withdrawMoney = 5000;
        //取款
        //多线程并发执行这个方法
        synchronized (act){
            act.withdraw(withdrawMoney);
        }
        //取款后输出提示信息
        System.out.println(Thread.currentThread().getName() + "对" + act.getActno() + "账户取款成功，当前余额为：" + act.getBalance());
    }
}
