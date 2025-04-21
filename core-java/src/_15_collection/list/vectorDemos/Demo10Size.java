package _15_collection.list.vectorDemos;

import java.util.Vector;

public class Demo10Size {
    public static void main(String[] args) {
        Vector<Integer> list1 = new Vector<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(51);
        list1.add(62);
        list1.add(53);

        Vector<Integer> list2 = new Vector<>();
        list2.add(10);
        list2.add(4444);
        list2.add(30);

        System.out.println("list1 size is "+list1.size());//8
        System.out.println("list2 size is "+list2.size());//3
        System.out.println("is empty "+list1.isEmpty());//false

    }
}
