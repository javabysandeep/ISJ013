package _15_collection._1_list.sorting.comparableDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2SortingUsingComparable {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Pratham");
        list.add("Gunaji");
        list.add("Pravin");
        list.add("Komal");
        list.add("Shital");
        list.add("Lokesh");
        list.add("Rahul");
        list.add("Ridhay");
        list.add("Anusya");

        System.out.println("list before sorting: " + list);

        //we are providing a list of strings which are of type Comparable
        Collections.sort(list);//sorting

        System.out.println("list after sorting: " + list);
    }
}
