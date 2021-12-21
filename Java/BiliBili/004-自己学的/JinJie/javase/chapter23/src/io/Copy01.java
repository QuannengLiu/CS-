package io;
/**
 *使用FileInputStream + FileOutputStream完成文件的拷贝。
 * 拷贝的过程应该是一边读，一边写。
 * 使用以上的字节流拷贝文件的时候，文件类型随意，万能的。什么样的文件都能拷贝。
 *
 * @author QUANNENG LIU
 * @Date  2021/12/07
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //创建输入流对象
            fis = new FileInputStream("E:\\E\\ADOWNLOAD\\GoogleDownload\\剑指offer 名企面试官精讲典型编程题.pdf");
            //创建输出流对象
            fos = new FileOutputStream("D:\\剑指offer 名企面试官精讲典型编程题.pdf");
            fis.read();
            //创建一个数组，用于定义一次读取读取的数据量
            byte[] bytes = new byte[1024*1024];
            //最核心，一边读一边写
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readCount);
            }
            //易错易忘记，输出流最后要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //分别try两个关闭，因在一起第一个有异常，第二个就不能关闭
            if (fis != null)
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
