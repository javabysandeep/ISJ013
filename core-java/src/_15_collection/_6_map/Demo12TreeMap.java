package _15_collection._6_map;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo12TreeMap {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 120000.0);
        Product product2 = new Product(11, "Mobile", 999.0);
        Product product3 = new Product(2, "Charger", 99.0);
        Product product4 = new Product(12, "Camera", 12234.0);
        Product product5 = new Product(3, "Mic", 163.90);

        Comparator<Product> comparator = (p1, p2) -> p1.getId() - p2.getId();

        Map<Product, Integer> map = new TreeMap<>(comparator);
        map.put(product1, 76);
        map.put(product2, 56);
        map.put(product3, 89);
        map.put(product4, 55);
        map.put(product5, 45);

        map.entrySet().forEach(System.out::println);

    }
}
