package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *学习FileReader类：
 *     1、文件字符输入流，只能读取普通文本。
 *     2、读取文本内容时，比较方便，快捷。
 *
 * @author QUANNENG LIU
 * @Date  2021/12/07
 */
public class FileReaderTest {

    public static void main(String[] args) {
        //创建文件字符输入流
        FileReader reader = null;
        try {
            reader = new FileReader("tempfile");
            //创建char数组
            char[] chars = new char[3];
            //往char数组中读数据
            reader.read(chars);
            for (char c:chars
                 ) {
                System.out.println(c);
            }
            System.out.println("==============================");
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1){
                System.out.println(readCount);
                System.out.println(new String(chars,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
