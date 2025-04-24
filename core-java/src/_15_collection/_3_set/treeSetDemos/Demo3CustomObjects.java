package _15_collection._3_set.treeSetDemos;

import java.util.*;

public class Demo3CustomObjects {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 120000.0);
        Product product2 = new Product(11, "Mobile", 999.0);
        Product product3 = new Product(2, "Charger", 99.0);
        Product product4 = new Product(12, "Camera", 12234.0);
        Product product5 = new Product(3, "Mic", 163.90);

        Set<Product> set = new TreeSet<>();
        set.add(product1);
        set.add(product2);
        set.add(product3);
        set.add(product4);
        set.add(product5);

        set.forEach(System.out::println);

    }
}
