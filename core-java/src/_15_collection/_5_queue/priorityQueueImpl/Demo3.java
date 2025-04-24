package _15_collection._5_queue.priorityQueueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {
    public static void main(String[] args) {
        //process the elements based on the number of characters in the name. desc

        Comparator<String> comparator = (s1, s2) -> s2.length() - s1.length();

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
           Gunajirao
            Pratham
            Sainath
            Srushti
            Ridhay
            Pravin
            Lokesh
            Anusya
            Shital

        * */

    }
}
