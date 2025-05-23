package _15_collection._1_list.linkedListDemos;

import java.util.LinkedList;

public class Demo12IterateTraditionalForLoop {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //iterating the elements using traditional for loop
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

    }
}
