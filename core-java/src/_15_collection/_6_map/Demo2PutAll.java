package _15_collection._6_map;

import java.util.HashMap;
import java.util.Map;

public class Demo2PutAll {
    public static void main(String[] args) {
        //features :
        // Keys : unique keys, no insertion order of keys, homo, hetero keys, null(1)
        //values : no restrictions
        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key1", "value2");
        map.put(null, "value3");
        map.put(null, "value4");
        map.put(1, "value4");
        map.put(2, null);
        map.put(3, null);

        Map map2 = new HashMap();
        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);
    }
}
