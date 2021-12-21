package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");
            byte[] bytes = new byte[fis.available()];
//            System.out.println(fis.read(bytes));
            System.out.println("剩下没读的字节数：" + fis.available());
            System.out.println("===============================================");
            System.out.println(new String(bytes,0,fis.read(bytes)));
            System.out.println("===============================================");
            System.out.println(new String(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
