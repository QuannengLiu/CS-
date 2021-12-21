package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *学习PrintStream标准输出流
 *      1、标准输出流不需要手动close()关闭
 *      2、标准输出流的方向可以改变（默认为输出到控制台，可以改变方向输出到其他文件中去）
 * @author QUANNENG LIU
 * @Date  2021/12/08
 */
public class PrintStreamTest {

    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps = System.out;
        ps.println("hello world");
        ps.println("hello zhangsan");

        //改变标准输出流的方向
        PrintStream printStream = new PrintStream("");

    }






}
