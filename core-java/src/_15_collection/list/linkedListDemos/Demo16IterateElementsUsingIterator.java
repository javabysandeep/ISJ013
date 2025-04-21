package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo16IterateElementsUsingIterator {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //ConcurrentModificationException
        //fail-fast, fail-safe


        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



    }
}
