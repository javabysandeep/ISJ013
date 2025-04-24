package _15_collection._6_map;

import java.util.HashMap;

public class Demo5Get {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
        hm.put(6, "F");

        System.out.println("Get value by specifying the key " + hm.get(1));//A
        System.out.println("Get value by specifying the key " + hm.get(2));//B
        System.out.println("Get value by specifying the key " + hm.get(3));//C
        System.out.println("Get value by specifying the key " + hm.get(4));//D
        System.out.println("Get value by specifying the key " + hm.get(5));//E
        System.out.println("Get value by specifying the key " + hm.get(6));//F
        System.out.println("Get value by specifying the key " + hm.get(7));//null
        System.out.println("Get value by specifying the key " + hm.getOrDefault(7, "this is dummy default value"));//this is dummy default value
        System.out.println("Get value by specifying the key " + hm.getOrDefault(8, "this is dummy default value"));//this is dummy default value
    }
}
