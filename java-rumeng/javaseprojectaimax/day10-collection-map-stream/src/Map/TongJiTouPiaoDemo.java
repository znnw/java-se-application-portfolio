package Map;

import java.util.*;

public class TongJiTouPiaoDemo {
    public static void main(String[] args) {
        calc();
    }
    public static void calc(){
        List<String> locations = new ArrayList<>();
        String []names ={"张三","张三","张三"};
        Random r =new Random();
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(names.length);
            String name = names[index];
            locations.add(name);
        }
        System.out.println(locations);

        Map<String,Integer> map = new HashMap<>();

        for (String name : locations) {
            if(map.containsKey(name)){
                Integer count = map.get(name);
                map.put(name, count+1);
            }else{
                map.put(name, 1);
            }
        }

        map.forEach((name,count)->{
            System.out.println(name+"的票数是："+count);
        });
    }
}
