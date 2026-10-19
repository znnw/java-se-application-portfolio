package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTravelse {

    private static BiConsumer<? super String, ? super Integer> k,v;

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("王五", 20);
        map.put("赵六", 19);

        System.out.println("Map内容：" + map);
    }
}
