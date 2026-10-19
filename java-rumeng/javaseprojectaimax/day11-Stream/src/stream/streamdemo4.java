package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamdemo4 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("张三", "李四", "王五", "赵六");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("1. forEach - 遍历:");
        names.stream()
                .forEach(System.out::println);

        System.out.println("\n2. count - 计数:");
        long count = names.stream().count();
        System.out.println("总数: " + count);

        System.out.println("\n3. toArray - 转数组:");
        Object[] array = names.stream().toArray();
        System.out.println("数组: " + Arrays.toString(array));

        System.out.println("\n4. collect - 收集到List:");
        List<String> list = names.stream()
                .filter(name -> name.startsWith("张"))
                .collect(Collectors.toList());
        System.out.println("结果: " + list);

        System.out.println("\n5. reduce - 归约求和:");
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("总和: " + sum);

        System.out.println("\n6. min/max - 最小值/最大值:");
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        System.out.println("最小值: " + min.get());
        System.out.println("最大值: " + max.get());

        System.out.println("\n7. findFirst - 找第一个:");
        Optional<String> first = names.stream().findFirst();
        System.out.println("第一个: " + first.get());

        System.out.println("\n8. anyMatch/allMatch - 匹配判断:");
        boolean hasZhang = names.stream().anyMatch(name -> name.startsWith("张"));
        boolean allTwoChar = names.stream().allMatch(name -> name.length() == 2);
        System.out.println("有姓张的吗? " + hasZhang);
        System.out.println("都是2个字吗? " + allTwoChar);
    }
}
