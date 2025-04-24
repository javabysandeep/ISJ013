package _15_collection._6_map;

import java.util.HashMap;

public class Demo6Contains {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        hm.put(5, "E");
        hm.put(6, "F");

        System.out.println("if the key is present " + hm.containsKey(1));//true
        System.out.println("if the value is present " + hm.containsValue("D"));//true

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(1, "A");
        hm2.put(2, "B");

    }
}
