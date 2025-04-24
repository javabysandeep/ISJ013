package _15_collection._5_queue.priorityQueueImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(10);
        queue.add(1);
        queue.add(11);
        queue.add(2);
        queue.add(12);
        queue.add(3);
        queue.add(13);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        //poll : removes the element
        //output :
    }
}
