package _15_collection._1_list.vectorDemos;

import java.util.Vector;

public class Demo4RetainsAll {
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

        Vector retentionList = new Vector();
        retentionList.add("A");
        retentionList.add("B");
        retentionList.add("C");

        System.out.println("Before removal:");
        System.out.println(list);

        System.out.println("After removal:");
        list.retainAll(retentionList);
        System.out.println(list);
    }
}
