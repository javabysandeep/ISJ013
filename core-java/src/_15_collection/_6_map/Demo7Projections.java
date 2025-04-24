package _15_collection._6_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo7Projections {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");

        //keys
        Set<Integer> keys = map.keySet();
        System.out.println("Only keys");
        System.out.println(keys);

        //values
        Collection<String> values = map.values();
        System.out.println("Only values");
        System.out.println(values);

        //Entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Only entries");
        System.out.println(entries);
    }
}
