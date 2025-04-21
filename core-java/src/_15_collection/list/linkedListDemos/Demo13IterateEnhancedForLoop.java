package _15_collection.list.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo13IterateEnhancedForLoop {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (Integer temp : list) {
            System.out.println(temp);
        }

    }
}
