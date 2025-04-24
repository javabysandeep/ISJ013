package _15_collection._6_map;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private double salary;

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}