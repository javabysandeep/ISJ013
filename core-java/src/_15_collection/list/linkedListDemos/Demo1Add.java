package _15_collection.list.linkedListDemos;

import java.util.LinkedList;
import java.util.Vector;

public class Demo1Add {
    public static void main(String[] args) {
        // homo, hetero, null*, insertion order, duplicates
        LinkedList list = new LinkedList();
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
