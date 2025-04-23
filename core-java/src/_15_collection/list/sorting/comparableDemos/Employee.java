package _15_collection.list.sorting.comparableDemos;

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
    public int compareTo(Employee employee) {
        // single field sorting
        //sorting employees based on id
        //return this.id - employee.id;

        //sorting employees based on salary
        //return (int) (this.salary - employee.salary);

        //sorting employees based on name
        //employee1.compareTo(employee2);
        return this.name.compareTo(employee.name);
    }
}
