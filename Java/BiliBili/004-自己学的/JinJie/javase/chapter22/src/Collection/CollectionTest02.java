package Collection;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合的迭代，很重要
 * @author lan
 */
public class CollectionTest02 {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //获取迭代器对象
        Iterator it = c.iterator();
        //迭代集合
        while( it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
