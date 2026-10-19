package hashset;

import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Set<String> set = new java.util.HashSet<>();
        // 添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("hello");
        // 遍历集合
        for (String s : set) {
            System.out.println(s);
        }
    }
}
