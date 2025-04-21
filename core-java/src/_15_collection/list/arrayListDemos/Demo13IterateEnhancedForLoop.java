package _15_collection.list.arrayListDemos;

import java.util.ArrayList;

public class Demo13IterateEnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
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
