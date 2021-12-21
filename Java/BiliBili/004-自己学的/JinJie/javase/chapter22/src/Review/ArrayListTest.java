package Review;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList需要掌握的内容
 * 1.集合对象的创建
 * 2.向集合中添加元素
 * 3.从集合中取出某个元素
 * 4.遍历元素
 */

public class ArrayListTest {

    public static void main(String[] args) {
//        集合对象的创建
        ArrayList<String> list = new ArrayList<>();
//        添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
//        从集合中取出元素
        String firstElt = list.get(0);
        System.out.println(firstElt);

        System.out.println(list.get(0));
        System.out.println("===================================================");
//      遍历
//      方法一：采用for循环
        for (int i = 0; i < list.size() ; i++){
            System.out.println("for循环：" + list.get(i));
        }
//        方法二：迭代器
        System.out.println("===================================================");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        方法三：foreach
        System.out.println("===================================================");
        for (String s:list) {
            System.out.println(list);
        }
    }
}
