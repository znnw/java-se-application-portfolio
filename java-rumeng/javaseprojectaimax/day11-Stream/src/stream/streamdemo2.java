package stream;

import java.util.*;
import java.util.stream.Stream;

public class streamdemo2 {
    public static void main(String [] args){
        Collection< String> list = new ArrayList<>();
        Stream<String> s1= list.stream();

        Map<String,Integer> map = new HashMap<>();
        Stream<String> s2 = map.keySet().stream();
        Stream<Integer> s3 = map.values().stream();
        Stream<Map.Entry<String,Integer>> s4 = map.entrySet().stream();

        String[]names = {"张三","王五","赵六"};
        Stream<String> s5 = Arrays.stream( names);
        Stream<String> s6 = Stream.generate(()->"张三");
        Stream<String> s7 =Stream.of("张三","王五","赵六");
    }
}
