package _15_collection._5_queue.priorityQueueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4 {
    public static void main(String[] args) {
        //descending order
        Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);
        Queue<String> queue = new PriorityQueue<>(comparator);
        queue.add("Sainath");
        queue.add("Pratham");
        queue.add("Gunajirao");
        queue.add("Lokesh");
        queue.add("Pravin");
        queue.add("Ridhay");
        queue.add("Srushti");
        queue.add("Anusya");
        queue.add("Shital");

        for (int i = 1; i <= 9; i++) {
            System.out.println(queue.poll());
        }

        /*
        * output
            Srushti
            Shital
            Sainath
            Ridhay
            Pravin
            Pratham
            Lokesh
            Gunajirao
            Anusya

        * */

    }
}
