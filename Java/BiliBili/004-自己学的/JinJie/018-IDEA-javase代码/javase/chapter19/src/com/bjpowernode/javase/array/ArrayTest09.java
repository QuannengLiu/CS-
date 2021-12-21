package com.bjpowernode.javase.array;
/*
关于java中的二维数组
    1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组。
    2、三维数组是什么？
        三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组。
        实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用。
    3、二维数组静态初始化
        int[][] array = {{1,1,1},{2,3,4,5},{0,0,0,0},{2,3,4,5},{2,3,4,5},{2,3,4,5},{2,3,4,5}};
 */
public class ArrayTest09 {
    public static void main(String[] args) {
        // 一维数组
        int[] array = {100, 200, 300};
        System.out.println(array.length); // 3
        System.out.println("=======================");

        // 二维数组
        // 以下代码当中：里面的是4个一维数组。
        int[][] a = {
                {100, 200, 300},
                {30, 20, 40, 50, 60},
                {6, 7, 9, 1},
                {0}
        };
        System.out.println(a.length); // 4
        System.out.println(a[0].length); // 3
        System.out.println(a[1].length); // 5
        System.out.println(a[2].length); // 4
        System.out.println(a[3].length); // 1

        // 里面的是5个一维数组。
        int[][] a2 = {
                {100, 200, 300},
                {30, 20, 40, 50, 60},
                {6, 7, 9, 1},
                {0},
                {1,2,3,4,5}
        };

    }

    /*
        关于二维数组中元素的：读和改。

            a[二维数组中的一维数组的下标][一维数组的下标]

            a[0][0]：表示第1个一维数组中的第1个元素。

            a[3][100]：表示第4个一维数组中的第101个元素。

            注意：对于a[3][100]来说，其中 a[3] 是一个整体。[100]是前面a[3]执行结束的结果然后再下标100.
         */
    public static class ArrayTest10 {
        public static void main(String[] args) {
            // 二维数组
            int[][] a = {
                    {34,4,65},
                    {100,200,3900,111},
                    {0}
            };

            // 请取出以上二位数中的第1个一维数组。
            int[] 我是第1个一维数组 = a[0];
            int 我是第1个一维数组中的第1个元素 = 我是第1个一维数组[0];
            System.out.println(我是第1个一维数组中的第1个元素);

            // 以下代码的由来是因为以上代码的合并导致的。
            System.out.println(a[0][0]);

            // 取出第2个一维数组当中第3个元素
            System.out.println("第二个一维数组中第三个元素：" + a[1][2]);

            // 取出第3个一维数组当中第1个元素
            System.out.println("第3个一维数组中第1个元素：" + a[2][0]);

            // 改
            a[2][0] = 11111;
            System.out.println(a[2][0]);

            // 注意别越界。
            //java.lang.ArrayIndexOutOfBoundsException
            //System.out.println(a[2][1]);
        }
    }
}
