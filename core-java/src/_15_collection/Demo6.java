package _15_collection;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        //homo, hetero, duplicate, insertion order, any number of nulls
        ArrayList list1 = new ArrayList();
        list1.add("A");
        list1.add("A");
        list1.add(100);
        list1.add(100);
        list1.add("B");
        list1.add(null);
        list1.add(null);
        list1.add(true);
        list1.add(false);
        list1.add(100.50f);

        ArrayList list2 = new ArrayList();
        list2.addAll(list1);
        list2.add("some extra elements in list2");
        System.out.println(list2);

        System.out.println("whether B is present or not : " + list2.contains("B"));
        System.out.println("whether list1 is present in list2 or not : " + list2.containsAll(list1));

        list2.remove("B");
        System.out.println("After removal : " + list2);

        list2.removeAll(list1);
        System.out.println("After removal : " + list2);

        list2.clear();
        System.out.println("After clear : " + list2);
    }
}
