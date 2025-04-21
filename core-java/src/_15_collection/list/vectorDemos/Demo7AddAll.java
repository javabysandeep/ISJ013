package _15_collection.list.vectorDemos;

import java.util.ArrayList;
import java.util.Vector;

public class Demo7AddAll {
    public static void main(String[] args) {
        Vector<String> list1 = new Vector<>();
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

        Vector<String> list2 = new Vector<>();
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
