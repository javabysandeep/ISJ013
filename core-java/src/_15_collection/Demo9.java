package _15_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("Abc");
        list.add("Abcd");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Before removal " + list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("After removal " + list);

    }
}
