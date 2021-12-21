package Review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ArrayList需要掌握的内容
 * 1.集合对象的创建
 * 2.向集合中添加元素
 * 3.从集合中取出某个元素
 * 4.遍历元素:两种方法;方法一：先获取所有的key，再通过遍历key来获取value;方法二：将Map集合转化成Set集合，Set集合中的每一个元素是Node（Node节点中只有key和value）.
 */
public class HashMapTest {

    public static void main(String[] args) {

        /**
         * 创建集合
         */
        Map<Integer, String> map = new HashMap<>();
        //添加元素
        map.put(10, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "simth");
        map.put(3, "wangwu");
        //获取元素个数
        System.out.println("集合的尺寸为：" + map.size());
        //遍历元素
        //方法一：先获取所有的key，再通过遍历key来获取value
        Set<Integer> keys = map.keySet();
        for (Integer key:
             keys) {
            System.out.println(key + "=" + map.get(key));
        }

        //方法二：将Map集合转化成Set集合，Set集合中的每一个元素是Node（Node节点中只有key和value）.
        Set<Map.Entry<Integer,String>> nodes = map.entrySet();
        System.out.println("================================================");
        for (Map.Entry<Integer, String> node:nodes
             ) {
            System.out.println(node.getKey() + "=" + node.getValue() );
        }

    }


}
