package _15_collection._5_queue.priorityQueueImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo2 {
    public static void main(String[] args) {
        //by default ascending order
        Queue<String> queue = new PriorityQueue<>();
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
            Anusya
            Gunajirao
            Lokesh
            Pratham
            Pravin
            Ridhay
            Sainath
            Shital
            Srushti

        * */

    }
}
