package _15_collection.list;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        //homo, hetero, duplicate, any number of nulls, insertion order
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("A");
        list.add(100);
        list.add(100);
        list.add("B");
        list.add(null);
        list.add(null);
        list.add(true);
        list.add(false);
        list.add(100.50f);
        System.out.println(list);
    }
}
