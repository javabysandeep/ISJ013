package _15_collection.set.treeSetDemos;

import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        //feature : unique, homo, null(0), sorting order
        Set set = new TreeSet();
        set.add("A");
        set.add("A");
        set.add("B");
        //set.add(null);//not allowed even once
        set.add("C");
        set.add("D");
        set.add("D");
        //set.add(101);//ClassCastException : home

        System.out.println(set);//[A, B, C, D]
    }
}
