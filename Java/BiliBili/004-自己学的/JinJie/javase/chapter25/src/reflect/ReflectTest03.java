package reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *ReflectTest02中通过反射机制来new对象的好处：可以做到不改变java源码的情况下，做到不同对象的实例化（即符合OCP原则：对拓展开放，对修改关闭）
 *
 * @author QUANNENG LIU
 * @Date  2021/12/13
 */
public class ReflectTest03 {
    public static void main(String[] args){

        FileReader reader = null;
        try {
            //通过IO流读取classinfo2.properties文件
//            reader = new FileReader("chapter25/classinfo.properties");
            reader = new FileReader("chapter25/src/classinfo2.properties");
            //创建属性类的Map
            Properties pro = new Properties();
            //加载
            pro.load(reader);
            //通过key获取value
            String strName = pro.getProperty("className");
            //通过反射机制实例化对象
            Class c = Class.forName(strName);
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            //自己练习了一遍
            /*//通过IO流读取属性配置文件
            FileReader reader = null;
            try {
                //新建一个IO流读取属性配置文件
                reader = new FileReader("chapter/classinfo2.className");
                //新建一个Map集合
                Properties pro = new Properties();
                //加载
                pro.load(reader);
                //获取Map中的key值，Map中的Value和key值都是String类型
                String strName = pro.getProperty("className");
                //通过反射机制new对象
                //获取类的字节码文件
                Class c1 = Class.forName("java.lang.String");
                //通过字节码文件new对象
                Object obj = c1.newInstance();
                System.out.println(obj);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (reader != null){
                    try {
                        //关闭IO流
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }*/
        }
    }

        //抛出异常
  /*     //通过IO流读取classinfo2.properties文件
        FileReader reader = new FileReader("chapter25/classinfo.properties");
        //创建属性类的Map
        Properties pro = new Properties();
        //加载
        pro.load(reader);
        reader.close();
        //通过key获取value
        String className = pro.getProperty("className");
        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }*/
}
