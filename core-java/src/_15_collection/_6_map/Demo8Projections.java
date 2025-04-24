package _15_collection._6_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo8Projections {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(300, "C");
        map.put(40, "D");
        map.put(5, "E");
        map.put(6, "F");
        map.put(7, "G");
        map.put(8, "H");
        System.out.println(map);

        System.out.println("Entries");
        //Entries
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "\t " + entry.getValue());
        }
    }
}
