import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 *使用定时器设定定时任务
 *
 * @author QUANNENG LIU
 * @Date  2021/12/12
 */
public class TimerTest {
    public static void main(String[] args) throws Exception{
        //新建定时器对象
        Timer timer = new Timer();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = sdf.parse("2021-12-12 17:45:42");

//        timer.schedule(new LogTimerTask(), firstTime,1000*10);
    }
}

//编写一个记录日志的定时任务
class LogTimerTask extends TimerTest{

    public void run(){
        //编写一个时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //新建时间
        String strTime = sdf.format(new Date());
        System.out.println(strTime + "：成功完成了一次数据备份");
    }

}