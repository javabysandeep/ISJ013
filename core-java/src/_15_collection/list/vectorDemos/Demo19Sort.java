package _15_collection.list.vectorDemos;

import java.util.Collections;
import java.util.Vector;

public class Demo19Sort {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
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
