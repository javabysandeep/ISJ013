package _15_collection.list.arrayListDemos;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo9ContainsContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(51);
        list.add(62);
        list.add(53);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(4444);
        list2.add(30);

        System.out.println(list.contains(10));//true
        System.out.println(list.containsAll(list2));//false

    }
}
