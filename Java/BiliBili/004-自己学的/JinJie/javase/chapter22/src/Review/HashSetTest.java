package Review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * HashSet需要掌握的内容
 * 1.集合对象的创建
 * 2.向集合中添加元素
 * 3.遍历元素
 * 4.HashSet无序不可重复
 * 5.HashMap的key：储存在HashMap中的key的元素要同时重写hashCode + equals
 */
public class HashSetTest {

    public static void main(String[] args) {

        //创建HashSet集合
        HashSet<String> set = new HashSet<>();
        //向HashSet中添加元素
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhaoliu");
        set.add("zhaoliu");
        set.add("zhaoliu");

        //从集合中取出元素,set中的元素不能通过集合来取
//        遍历集合
//        方法一：迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        方法二：foreach
        System.out.println("===========================================");
/*foreach错误示范
        for (String s:set
             ) {
            System.out.println(set);
        }
*/

//foreach正确示范
        for (String s:set
        ) {
            System.out.println(s);
        }
//        换成新建一个存储Student类型的集合
        Set<Student> set2 = new HashSet<>();
//      往集合中添加元素
        Student xiaoming = new Student(202101,"xiaoming");
        set2.add(xiaoming);
        Student xiaohong = new Student(202102,"xiaohong");
        set2.add(xiaohong);
        Student xiaogang = new Student(202103,"xiaogang");
        set2.add(xiaogang);

//        遍历元素
//        方法一：迭代器遍历
        Iterator<Student> s2 = set2.iterator();
        System.out.println("===========================================");
        while (s2.hasNext()){
            System.out.println(s2.next());
        }
//        方法一：foreach遍历
        System.out.println("===========================================");
        for (Student s:set2
             ) {
            System.out.println(s);
        }
    }
}

class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }
}