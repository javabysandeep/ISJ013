package _15_collection.set.treeSetDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(100);
        set.add(1);
        set.add(11);
        set.add(113);
        set.add(12);
        set.add(17);

        //same type, unique, no null, sorting order[objects are of type Comparable]
        System.out.println(set);//[1, 11, 12, 17, 100, 113]
    }
}
