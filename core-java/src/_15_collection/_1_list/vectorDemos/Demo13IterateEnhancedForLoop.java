package _15_collection._1_list.vectorDemos;

import java.util.Vector;

public class Demo13IterateEnhancedForLoop {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
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
