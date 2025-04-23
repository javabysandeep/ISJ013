package _15_collection.list.sorting.comparableDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4SortingUsingComparable {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 120000.0);
        Product product2 = new Product(11, "Mobile", 999.0);
        Product product3 = new Product(2, "Charger", 99.0);
        Product product4 = new Product(12, "Camera", 12234.0);
        Product product5 = new Product(3, "Mic", 163.90);
        List<Product> list = new ArrayList();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);

        System.out.println("before sorting");
        list.forEach(System.out::println);

        //sort products
        Collections.sort(list);


        System.out.println("after sorting");
        list.forEach(System.out::println);


    }
}
