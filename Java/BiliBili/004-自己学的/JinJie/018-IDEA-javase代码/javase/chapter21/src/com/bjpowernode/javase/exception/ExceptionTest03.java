package com.bjpowernode.javase.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {
        /*
        程序执行到此处发生了ArithmeticException异常，
        底层new了一个ArithmeticException异常对象，
        然后抛出了，由于是main方法调用了100 / 0，
        所以这个异常ArithmeticException抛给了main方法，
        main方法没有处理，将这个异常自动抛给了JVM。
        JVM最终终止程序的执行。

        ArithmeticException 继承 RuntimeException，属于运行时异常。
        在编写程序阶段不需要对这种异常进行预先的处理。
         */
        System.out.println(100 / 0);

        // 这里的HelloWorld没有输出，没有执行。
        System.out.println("Hello World!");
    }

    /*
        以下代码报错的原因是什么？
            因为doSome()方法声明位置上使用了：throws ClassNotFoundException
            而ClassNotFoundException是编译时异常。必须编写代码时处理，没有处理
            编译器报错。
         */
    public static class ExceptionTest04 {
        public static void main(String[] args) {
            // main方法中调用doSome()方法
            // 因为doSome()方法声明位置上有：throws ClassNotFoundException
            // 我们在调用doSome()方法的时候必须对这种异常进行预先的处理。
            // 如果不处理，编译器就报错。
            //编译器报错信息： Unhandled exception: java.lang.ClassNotFoundException
            //doSome();
        }

        /**
         * doSome方法在方法声明的位置上使用了：throws ClassNotFoundException
         * 这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常。
         * 叫做类没找到异常。这个异常直接父类是：Exception，所以ClassNotFoundException属于编译时异常。
         * @throws ClassNotFoundException
         */
        public static void doSome() throws ClassNotFoundException{
            System.out.println("doSome!!!!");
        }

    }
}
