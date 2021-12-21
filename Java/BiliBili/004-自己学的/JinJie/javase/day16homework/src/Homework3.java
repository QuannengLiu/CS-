public class Homework3 {

    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        t1.display();
        t1.addSecond(30);
        t1.addMin(12);
        t1.addHou(3);
        System.out.println("当前时间为："+ t1.getHou() + ":" + t1.getMin() + ":" + t1.getSec());

        MyTime t2 = new MyTime(12,56,23);
        t2.display();

    }
}

class MyTime{

    private int hou;
    private int min;
    private int sec;

//    插入无参数构造方法
    public MyTime() {
    }

//    插入有参数构造方法
    public MyTime(int hou, int min, int sec) {
/*        if (sec > 60 || sec < 0){
            System.out.println("对不起，您输入的秒不合法。");
        }else if (min > 60 || min < 0){
            System.out.println("对不起，您输入的分不合法。");
        }else if (hou > 24 || hou < 0){
            System.out.println("对不起，您输入的时不合法。");*/
            this.sec = sec;
            this.min = min;
            this.hou = hou;
        }

/*      this.sec = sec;
        this.min = min;
        this.hou = hou;
*/

//    插入setter和getter方法


    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHou() {
        return hou;
    }

    public void setHou(int hou) {
        this.hou = hou;
    }

//    定义方法显示时间

    public void display(){
//无this
        System.out.println("当前时间为："+ getHou() + ":" + getMin() + ":" + getSec());
// 有this
       System.out.println("当前时间为："+ this.getHou() + ":" + this.getMin() + ":" + this.getSec());


    }

    //    定义方法对“时”加运算
    public void addHou(int hou){

        this.hou = hou + getHou();

    }

    //    定义方法对“分”加运算
    public void addMin(int min){

        this.min = min + getMin();

    }

    //    定义方法对“秒”加运算
    public void addSecond(int sec){

    this.sec = sec + getSec();

    }

    //    定义方法对“时”减运算
    public void subHou(int hou){

        this.hou = hou - getHou();

    }

    //    定义方法对“分”减运算
    public void subMin(int min){

        this.min = min - getMin();

    }

    //    定义方法对“秒”减运算
    public void subSecond(int sec){

        this.sec = sec  - getSec();

    }

}
