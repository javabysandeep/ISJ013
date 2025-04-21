package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo7AddAll {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("A");
        list1.add("A");
        list1.add("G");
        list1.add("H");
        list1.add("I");
        list1.add("J");

        LinkedList<String> list2 = new LinkedList();
        list2.add("Hello World Java");
        list2.add("Hello World Python");
        list2.add("Hello World PHP");
        list2.add("Hello World C");
        list2.add("Hello World C++");


        //add another collection
        list1.addAll(list2);

        list2.clear();

        System.out.println(list1);
        System.out.println(list2);

    }
}
