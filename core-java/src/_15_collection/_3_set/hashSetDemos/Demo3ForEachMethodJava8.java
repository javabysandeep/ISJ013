package _15_collection._3_set.hashSetDemos;

import java.util.HashSet;
import java.util.Set;

public class Demo3ForEachMethodJava8 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        set.forEach(System.out::println);

    }
}
