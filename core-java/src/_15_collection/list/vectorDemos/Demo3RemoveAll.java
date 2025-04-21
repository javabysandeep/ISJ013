package _15_collection.list.vectorDemos;

import java.util.Vector;

public class Demo3RemoveAll {
    public static void main(String[] args) {
        Vector list = new Vector();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");

        Vector removalList = new Vector();
        removalList.add("A");
        removalList.add("B");
        removalList.add("C");

        System.out.println("Before removal:");
        System.out.println(list);

        System.out.println("After removal:");
        list.removeAll(removalList);
        System.out.println(list);
    }
}
