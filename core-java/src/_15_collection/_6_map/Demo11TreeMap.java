package _15_collection._6_map;

import java.util.TreeMap;

public class Demo11TreeMap {
    public static void main(String[] args) {
        //custom object
        TreeMap<Employee, String> map = new TreeMap<>();
        Employee employee1 = new Employee(1, "rahul", 21, 1000);
        Employee employee2 = new Employee(11, "gunaji", 22, 200);
        Employee employee3 = new Employee(10, "pratham", 19, 1100);
        Employee employee4 = new Employee(2, "komal", 20, 111);
        Employee employee5 = new Employee(6, "shital", 17, 800);

        map.put(employee1, "Pune");
        map.put(employee2, "Mumbai");
        map.put(employee3, "Noida");
        map.put(employee4, "Chennai");
        map.put(employee5, "Hyderabe");

        map.entrySet().forEach(System.out::println);
    }
}
