package Review;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet需要掌握的内容
 * 1.集合对象的创建
 * 2.向集合中添加元素
 * 3.遍历元素
 * 4.TreeSet无序不可重复，但是存储的元素可以自动按照大小顺序排序！(这里的无序指的是存进去的顺序和取出来的顺序不同,并且没有下标。)称为：可排序集合。
 * 5.TreeSet里为自定义元素,需要指定自定义对象的排序规则（通过实现Compare接口来达到目的）
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合
        TreeSet<String> ts = new TreeSet<>();
        //加入元素
        ts.add("A");
        ts.add("C");
        ts.add("Z");
        ts.add("X");
        ts.add("G");
        ts.add("M");
        ts.add("B");
        ts.add("B");
        ts.add("B");
        //遍历元素
        Iterator<String> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //创建集合Integer元素
        TreeSet<Integer> ts1 = new TreeSet<>();
        //加入元素
        ts1.add(1000);
        ts1.add(6);
        ts1.add(659);
        ts1.add(59);
        ts1.add(644);
        ts1.add(65);
        ts1.add(98);
        ts1.add(98);
        ts1.add(98);
        ts1.add(98);
        //遍历元素
        Iterator<Integer> it2 = ts1.iterator();
        System.out.println("=====================================");
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //创建集合自定义元素
        TreeSet<A> atree = new TreeSet<>();
        //加入元素
        atree.add(new A(1000));
        atree.add(new A(100));
        atree.add(new A(10));
        atree.add(new A(1));

        //遍历元素
        Iterator<A> a = atree.iterator();
        System.out.println("=====================================");
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}


class A implements Comparable<A>{
    int i;

    public A() {
    }

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return this.i - o.i;
    }
}