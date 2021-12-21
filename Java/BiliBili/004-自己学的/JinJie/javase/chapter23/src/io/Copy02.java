package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {

    public static void main(String[] args) {

        //创建文件字节输出、输入流
        FileReader in = null;
        FileWriter out = null;

        try {
            //读
            in = new FileReader("D:\\Users\\lan\\master\\course\\CS\\Java\\BiliBili\\004-自己学的\\01笔记\\IDEA快捷键.txt");
            //写
            out = new FileWriter("IDEA快捷键.txt");
            //一边读一边写
            char[] chars = new char[1024*1024];
            int readCount = 0;
            while((readCount = in.read(chars)) != -1){
                out.write(chars,0,readCount);
            }

            //刷新出口
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
