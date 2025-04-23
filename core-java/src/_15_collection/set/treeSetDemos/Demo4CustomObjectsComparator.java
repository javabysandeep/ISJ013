package _15_collection.set.treeSetDemos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo4CustomObjectsComparator {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "rahul", 21, 1000);
        Employee employee2 = new Employee(11, "gunaji", 22, 200);
        Employee employee3 = new Employee(10, "pratham", 19, 1100);
        Employee employee4 = new Employee(2, "komal", 20, 111);
        Employee employee5 = new Employee(6, "shital", 17, 800);

        Comparator<Employee> comparator = (e1, e2) -> e1.getId() - e2.getId();
        Set<Employee> set = new TreeSet<>(comparator);
        set.add(employee1);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        set.forEach(System.out::println);
    }
}
