package array;
/**
 *数组
 *
 * @author QUANNENG LIU
 * @Date  2021/12/10
 */

import java.sql.SQLOutput;

public class ArrayTest01 {

    public static void main(String[] args) {
        //声明数组：静态初始化方式一
        int[] a ={12,15,30};

        //此种为C++格式，不建议使用
        /*        //声明数组：静态初始化方式二
        int b[] ={12,15,30};*/

        //获取数组的长度属性
        System.out.println(a.length);

        //【读】数组数据：方法下标
        System.out.println("数组中的第一个元素：" + a[0] );

    }
}
