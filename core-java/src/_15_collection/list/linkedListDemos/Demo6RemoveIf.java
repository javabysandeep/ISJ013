package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Demo6RemoveIf {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("A");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        System.out.println("Before removal:");
        System.out.println(list);

        //removeIf method
        Predicate<String> condition = str -> str.startsWith("A");
        list.removeIf(condition);

        System.out.println("After removal:");
        System.out.println(list);
    }
}
