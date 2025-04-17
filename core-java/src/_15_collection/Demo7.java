package _15_collection;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("Abc");
        list.add("Abcd");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        //retainAll
        ArrayList<String> retentionList = new ArrayList<>();
        retentionList.add("C");
        retentionList.add("D");
        retentionList.add("E");
        list.retainAll(retentionList);
        System.out.println(list);

    }
}
