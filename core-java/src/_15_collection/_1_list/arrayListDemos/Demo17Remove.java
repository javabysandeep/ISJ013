package _15_collection._1_list.arrayListDemos;

import java.util.ArrayList;

public class Demo17Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(51);
        list.add(62);
        list.add(53);

        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                size--;
            }

        }
        System.out.println(list);

    }
}
