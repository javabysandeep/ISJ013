package _15_collection._1_list.linkedListDemos;

import java.util.LinkedList;

public class Demo2RemoveClear {
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
        System.out.println("Before removal");
        System.out.println(list);
        System.out.println("After removal");
        list.remove("A");


        System.out.println(list);
        list.clear();
        System.out.println("After clear");
        System.out.println(list);
    }
}
