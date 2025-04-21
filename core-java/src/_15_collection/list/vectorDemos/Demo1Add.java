package _15_collection.list.vectorDemos;

import java.util.ArrayList;

public class Demo1Add {
    public static void main(String[] args) {
        // homo, hetero, null*, insertion order, duplicates
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("A");
        list.add("B");
        list.add(100);
        list.add(100);
        list.add("C");
        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}
