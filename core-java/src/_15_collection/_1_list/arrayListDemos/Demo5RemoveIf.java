package _15_collection._1_list.arrayListDemos;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5RemoveIf {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("A");
        list.add("A");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        System.out.println("Before removal:");
        System.out.println(list);

        //removeIf method
        Predicate condition = input -> {
            String str = (String) input;
            return str.startsWith("A");
        };
        list.removeIf(condition);

        System.out.println("After removal:");
        System.out.println(list);
    }
}
