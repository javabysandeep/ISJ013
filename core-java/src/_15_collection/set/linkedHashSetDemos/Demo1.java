package _15_collection.set.linkedHashSetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //features
        // homo, hetero, unique, null(1),  Insertion order
        Set set = new LinkedHashSet();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        System.out.println("Set: " + set);
    }
}
