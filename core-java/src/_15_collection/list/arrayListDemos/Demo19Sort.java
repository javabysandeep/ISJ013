package _15_collection.list.arrayListDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo19Sort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Gunaji");
        list.add("Pratham");
        list.add("Pravin");
        list.add("Pritam");
        list.add("Lokesh");
        list.add("Anusaya");
        list.add("Suraj");
        list.add("Sainath");
        list.add("Soham");
        list.add("Ridhay");
        list.add("Shital");

        //sorting a list
        Collections.sort(list);

        //System.out.println(list);
        list.forEach(System.out::println);

    }
}
