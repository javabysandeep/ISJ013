package _15_collection._5_queue.priorityQueueImpl;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "rahul", 21, 1000);
        Employee employee2 = new Employee(11, "gunaji", 22, 200);
        Employee employee3 = new Employee(10, "pratham", 19, 1100);
        Employee employee4 = new Employee(2, "komal", 20, 111);
        Employee employee5 = new Employee(6, "shital", 17, 800);

        Queue<Employee> employeeQueue = new PriorityQueue<>();
        employeeQueue.add(employee1);
        employeeQueue.add(employee2);
        employeeQueue.add(employee3);
        employeeQueue.add(employee4);
        employeeQueue.add(employee5);

        for (int i = 0; i < 5; i++) {
            System.out.println(employeeQueue.poll());
        }
    }
}
