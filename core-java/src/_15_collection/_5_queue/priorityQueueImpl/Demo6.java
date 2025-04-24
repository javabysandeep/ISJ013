package _15_collection._5_queue.priorityQueueImpl;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo6 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 120000.0);
        Product product2 = new Product(11, "Mobile", 999.0);
        Product product3 = new Product(2, "Charger", 99.0);
        Product product4 = new Product(12, "Camera", 12234.0);
        Product product5 = new Product(3, "Mic", 163.90);

        //Comparator<Product> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        //Comparator<Product> comparator = (p1, p2) -> p2.getName().compareTo(p1.getName());
        Comparator<Product> comparator = (p1, p2) -> (int) (p1.getPrice() - p2.getPrice());
        Queue<Product> productQueue = new PriorityQueue<>(comparator);
        productQueue.add(product1);
        productQueue.add(product2);
        productQueue.add(product3);
        productQueue.add(product4);
        productQueue.add(product5);

        for (int i = 0; i < 5; i++) {
            System.out.println(productQueue.poll());
        }
    }
}
