package reflect;
/**
 *
 * 反射机制的作用：可以读和改字节码文件
 * 获取类的字节码文件的三种方式
 *      1、Class forName()第一种方式：静态方法Clas.forName()
 *              *静态方法
 *              *方法的参数是一个字符串
 *              *字符串需要的是完整类名
 *              *完整类名必须包括包名，以及java.lang
 *      2、第二种方式：引用.getClass()（java中任何一个对象都有.getClass方法）
 *      3、第三种方式：数据类型.class属性（java语言中任何一种类型都有.class属性，包括基本数据类型）
 * @author QUANNENG LIU
 * @Date  2021/12/13
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        //获取类的第一种方式：静态方法Clas.forName();
        Class c1 = null;
        try {
            //此处c1表示字节码文件String.class
            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取类的第二种方式：引用.getClass()（java中任何一个对象都有.getClass方法）
        String s = "abc";
        //此处x表示字节码文件String.class
        Class x = s.getClass();
        System.out.println(c1  == x);
        //获取类的第三种方式：数据类型.class属性（java语言中任何一种类型都有.class属性，包括基本数据类型）
        Class c3 = String.class;
        System.out.println(c3 == c1);
    }
}
