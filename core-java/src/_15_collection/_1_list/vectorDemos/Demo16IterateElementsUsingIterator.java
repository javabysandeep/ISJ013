package _15_collection._1_list.vectorDemos;

import java.util.Iterator;
import java.util.Vector;

public class Demo16IterateElementsUsingIterator {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
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
