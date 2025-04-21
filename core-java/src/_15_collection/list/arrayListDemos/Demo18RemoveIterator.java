package _15_collection.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo18RemoveIterator {
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
