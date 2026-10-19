package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        // 创建List集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("苹果");
        list.add("香蕉");
        list.add("橙子");
        list.add("葡萄");

        System.out.println("List集合内容: " + list);
        System.out.println("========================");

        // 第一种遍历方式：普通for循环（索引遍历）
        System.out.println("第一种：普通for循环遍历");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("元素" + i + ": " + list.get(i));
        }
        System.out.println("========================");

        // 第二种遍历方式：增强for循环（foreach遍历）
        System.out.println("第二种：增强for循环遍历");
        for (String item : list) {
            System.out.println("元素: " + item);
        }
        System.out.println("========================");

        // 第三种遍历方式：Iterator迭代器遍历
        System.out.println("第三种：Iterator迭代器遍历");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("元素: " + iterator.next());
        }
        System.out.println("========================");

        // 第四种遍历方式：Lambda表达式遍历（forEach方法）
        System.out.println("第四种：Lambda表达式遍历");
        list.forEach(item -> System.out.println("元素: " + item));
        System.out.println("========================");
    }
}