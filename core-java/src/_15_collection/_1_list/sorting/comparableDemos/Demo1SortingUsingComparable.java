package _15_collection._1_list.sorting.comparableDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1SortingUsingComparable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(11);
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(13);
        list.add(3);
        System.out.println("list before sorting: " + list);

        //we are providing a list of integers which are of type Comparable
        Collections.sort(list);//sorting

        System.out.println("list after sorting: " + list);
    }
}
