package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 *
 * @author Quanneng Liu
 * @Date 2021/12/06
 */

public class FileInputStreamTest01 {

    public static void main(String[] args){
        //创建输入流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");

            int readData = fis.read();
            System.out.println(readData);


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
