package io;
/**
 *
 *
 * @author Quanneng Liu
 * @Date  2021/12/06
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

    public static void main(String[] args){
        //创建输入流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");

            /*while(true){
                int readData = fis.read();
                System.out.println(readData);
                if (readData == -1){
                    break;
                }
            }*/

            //改进while循环
            int readData = 0;
            while(readData != -1){
                readData = fis.read();
                System.out.println(readData);
            }





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //在finally语句块中保证流一定关闭
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
