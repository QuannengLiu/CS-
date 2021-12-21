//编写一个简单的计算器

public class Homework4 {

    public static void main(String[] args) {

        Calculator number = new Calculator(10, 3);

        number.addition();
        number.subtration();
        number.multiplication();
        number.division();

    }

}

class Calculator{
//    定义两个整数n1,n2
    private int n1;
    private int n2;

//    定义方法“加”
    public void addition(){

        int result = getN1() +getN2();
        System.out.println(getN1() + "+" + getN2() + "=" + result);
//        return result;

    }

//    定义方法“减”
    public void subtration(){
        int result = getN1() - getN2();
        System.out.println(getN1() + "-" + getN2() + "=" + result);
//        return result;
    }

//    定义方法“乘”
    public void multiplication(){
        int result = getN1() * getN2();
        System.out.println(getN1() + "*" + getN2() + "=" + result);
//        return result;
    }

//    定义方法“除”
    public void division(){
        int result = getN1() / getN2();
        System.out.println(getN1() + "/" + getN2() + "=" + result);
//        return result;
    }

    public Calculator() {
    }

    public Calculator(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    //    n1的set和get方法
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
//    n2的set和get方法
    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
