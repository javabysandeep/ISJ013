package _15_collection.set.hashSetDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //features
        // homo, hetero, unique, null(1), no IO
        Set set = new HashSet();
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
