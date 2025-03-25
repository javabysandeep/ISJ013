package _10_object_class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Demo10DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        @ToString
        class Address implements Cloneable {
            private String city;
            private String state;
            private String country;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        @ToString
        class Employee implements Cloneable {
            private int id;
            private String name;
            private double salary;
            private Address address;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                Employee employee = (Employee) super.clone();
                Address newAddress = (Address) employee.getAddress().clone();
                employee.setAddress(newAddress);
                return employee;
            }
        }

        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setName("John");
        employee1.setSalary(50000);

        Address address = new Address();
        address.setCity("San Francisco");
        address.setState("CA");
        address.setCountry("US");

        employee1.setAddress(address);

        Employee employee2 = (Employee) employee1.clone();

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("address change");
        employee1.getAddress().setCity("Pune");
        System.out.println(employee1);
        System.out.println(employee2);


    }
}
