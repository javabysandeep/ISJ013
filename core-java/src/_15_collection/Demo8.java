package _15_collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("Abc");
        list.add("Abcd");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Predicate<String> predicate = str -> str.startsWith("A");
        System.out.println("Before removal "+list);
        list.removeIf(predicate);
        System.out.println("After removal "+list);

    }
}
