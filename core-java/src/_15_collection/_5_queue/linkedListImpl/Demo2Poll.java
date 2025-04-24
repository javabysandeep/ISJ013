package _15_collection._5_queue.linkedListImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2Poll {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue size " + queue.size());
        System.out.println("Poll method");
        System.out.println(queue.poll());//10
        System.out.println(queue.poll());//20
        System.out.println(queue.poll());//30
        System.out.println(queue.poll());//40
        System.out.println(queue.poll());//50
        System.out.println(queue.poll());//null
    }
}
