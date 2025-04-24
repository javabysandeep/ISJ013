package _15_collection._5_queue.linkedListImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1Remove {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.add(40);
        queue.add(50);

        System.out.println("Queue size "+queue.size());
        System.out.println("Remove method");
        System.out.println(queue.remove());//10
        System.out.println(queue.remove());//20
        System.out.println(queue.remove());//30
        System.out.println(queue.remove());//40
        System.out.println(queue.remove());//50
        System.out.println(queue.remove());//Exception
    }
}
