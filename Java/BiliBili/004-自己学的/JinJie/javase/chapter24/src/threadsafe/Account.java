package threadsafe;
/**
 *创建一个账户对象，有账户名和余额熟悉，有取款方法
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class Account extends Thread{
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdrawMoney){
        double before = this.balance;
        double after = before - withdrawMoney;
        //使取款动作慢一点
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        this.balance = after;
        this.setBalance(after);
    }
}
