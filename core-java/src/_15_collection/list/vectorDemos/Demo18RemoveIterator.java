package _15_collection.list.vectorDemos;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo18RemoveIterator {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(51);
        list.add(62);
        list.add(53);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
