package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp");

            byte[] bytes = new byte[4];
/*            while (true){
                int readCount = fis.read(bytes);
                if (readCount == -1) {
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }*/
            System.out.println("===================");

            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readCount));
            }

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
