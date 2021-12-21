package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");

            byte[] bytes = new byte[4];
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount));
            System.out.println("===============================");


            int readData = 0;
            while(readData != -1){
                readData = fis.read();
                System.out.println(readData);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
