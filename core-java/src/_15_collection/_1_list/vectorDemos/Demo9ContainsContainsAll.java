package _15_collection._1_list.vectorDemos;

import java.util.Vector;

public class Demo9ContainsContainsAll {
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

        Vector<Integer> list2 = new Vector<>();
        list2.add(10);
        list2.add(4444);
        list2.add(30);

        System.out.println(list.contains(10));//true
        System.out.println(list.containsAll(list2));//false

    }
}
