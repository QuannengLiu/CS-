package reflect;

import java.util.Arrays;

/**
 *获取class后，可以通过class来new对象
 *      1、new对象：字节码文件.newInstance();方法（此处默认调用的是该类的无参数构造方法，故应保证该类有无参数构造方法）
 *              *保证类有无参数构造方法的方式：1、若不写，则所有类都有一个无参数构造方法；若写了有参数无参数构造方法，没写无参数构造方法，则没有无参数构造方法；若没同时写了有参和无参构造方法，则有无参构造方法；
 *
 * @author QUANNENG LIU
 * @Date  2021/12/13
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        try {
            Class c1 = Class.forName("reflect.User");
            Object obj = c1.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        int[] array = {1,2,3};
        System.out.println(array.length);
    }
}
