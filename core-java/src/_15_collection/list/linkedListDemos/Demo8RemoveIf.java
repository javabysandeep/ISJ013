package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Demo8RemoveIf {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(51);
        list.add(62);
        list.add(53);

        //conditions --> even, odd, prime, perfect
        System.out.println("Before remove: " + list);


        Predicate<Integer> even = number -> number % 2 == 0;
        Predicate<Integer> odd = number -> number % 2 != 0;
        list.removeIf(even);
        System.out.println("After remove: " + list);

    }
}
