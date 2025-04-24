package _15_collection._6_map;

import java.util.Map;
import java.util.TreeMap;

public class Demo10TreeMap {
    public static void main(String[] args) {
        //features :
        // Keys : unique keys, sorting order of keys, homo keys, null(0)
        //values : no restrictions
        Map map = new TreeMap();
        //map.put("key1", "value1");
        map.put(7, "value2");
        //  map.put(null, "value3");
        // map.put(null, "value4");
        map.put(1, "value4");
        map.put(2, null);
        map.put(3, null);
        System.out.println(map);
    }
}
