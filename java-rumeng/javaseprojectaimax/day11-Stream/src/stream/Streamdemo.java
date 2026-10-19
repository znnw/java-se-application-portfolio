package stream;

import java.util.ArrayList;
import java.util.List;

public class Streamdemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("赵六");
        list.add("张三");

        List <String> newList =new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张")){
                newList.add(name);
            }
        }
        System.out.println(newList);
        System.out.println("-----------------");
        List <String> newList2 = list.stream().filter(name -> name.startsWith("张")).toList();
        System.out.println(newList2);

    }
}
