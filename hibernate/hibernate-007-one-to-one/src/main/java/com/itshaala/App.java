package com.itshaala;


import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Address;
import com.itshaala.model.Employee;

public class App {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Swargate");
        address.setCity("Pune");
        address.setState("MH");
        address.setCountry("India");

        Employee employee = new Employee();
        employee.setName("Pravin");
        employee.setSalary(100000);
        employee.setAddress(address);


        EmployeeDao eDao = new EmployeeDao();
        eDao.addEmployee(employee);
    }
}
