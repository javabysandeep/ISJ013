package _15_collection.list.sorting.comparableDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3SortingUsingComparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList();
        Employee employee1 = new Employee(1,"rahul",21,1000);
        Employee employee2 = new Employee(11,"gunaji",22,200);
        Employee employee3 = new Employee(10,"pratham",19,1100);
        Employee employee4 = new Employee(2,"komal",20,111);
        Employee employee5 = new Employee(6,"shital",17,800);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);

        System.out.println("list before sorting: ");
        list.forEach(System.out::println);

        //we are providing a list of employees which are of type Comparable
        Collections.sort(list);//sorting

        System.out.println("list after sorting: ");
        list.forEach(System.out::println);
    }
}
