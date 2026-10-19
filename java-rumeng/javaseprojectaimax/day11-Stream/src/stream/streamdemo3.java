package stream;

import java.util.Arrays;
import java.util.List;

public class streamdemo3 {

        public static void main(String[] args) {

            List<String> names = Arrays.asList("张三", "李四", "王五", "赵六", "张三");
            List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

            System.out.println("1. filter - 过滤出姓张的:");
            names.stream()
                    .filter(name -> name.startsWith("张"))
                    .forEach(System.out::println);

            System.out.println("\n2. map - 转大写:");
            names.stream()
                    .map(String::toUpperCase)
                    .forEach(System.out::println);

            System.out.println("\n3. distinct - 去重:");
            names.stream()
                    .distinct()
                    .forEach(System.out::println);

            System.out.println("\n4. sorted - 排序:");
            numbers.stream()
                    .sorted()
                    .forEach(System.out::println);

            System.out.println("\n5. limit - 只要前3个:");
            names.stream()
                    .limit(3)
                    .forEach(System.out::println);

            System.out.println("\n6. skip - 跳过前2个:");
            names.stream()
                    .skip(2)
                    .forEach(System.out::println);

            System.out.println("\n7. 组合使用 - 去重+过滤+排序+取前2个:");
            names.stream()
                    .distinct()
                    .filter(name -> name.startsWith("张") || name.startsWith("李"))
                    .sorted()
                    .limit(2)
                    .forEach(System.out::println);
        }
    }

