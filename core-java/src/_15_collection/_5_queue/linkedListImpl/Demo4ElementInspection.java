package _15_collection._5_queue.linkedListImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo4ElementInspection {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
       /* queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);*/

        System.out.println("Queue size " + queue.size());
        System.out.println("Element method");
        System.out.println(queue.element());//Exception
        System.out.println("Queue size " + queue.size());
    }
}
