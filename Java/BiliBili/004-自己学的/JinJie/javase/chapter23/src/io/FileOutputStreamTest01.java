package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //覆盖写入，源文件被覆盖
//            fos = new FileOutputStream("myfile");
            //追加写入，源文件不会被覆盖
            fos = new FileOutputStream("myfile",true);
            //开始写
            byte[] bytes = {97,98,99};
            //将bytes数组全部写出
            fos.write(bytes);
            //将bytes数组一部分写出(此处会在前两行代码后再写入)
            fos.write(bytes,0,2);

            String s = "我是一个中国人，我骄傲";
            //把字符串转换成数组
            byte[] bs = s.getBytes();
            //写入这个转换成的数组
            fos.write(bs);

            //写完之后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
