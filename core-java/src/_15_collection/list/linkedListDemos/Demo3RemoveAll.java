package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo3RemoveAll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        LinkedList removalList = new LinkedList();
        removalList.add("A");
        removalList.add("B");
        removalList.add("C");

        System.out.println("Before removal:");
        System.out.println(list);

        System.out.println("After removal:");
        list.removeAll(removalList);
        System.out.println(list);
    }
}
