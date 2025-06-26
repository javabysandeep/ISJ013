package com.itshaala;


import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Address;
import com.itshaala.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setStreet("Swargate");
        address1.setCity("Pune");
        address1.setState("MH");
        address1.setCountry("India");

        Address address2 = new Address();
        address2.setStreet("Chinchwad");
        address2.setCity("Pune");
        address2.setState("MH");
        address2.setCountry("India");

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(address1);
        addresses.add(address2);

        Employee employee = new Employee();
        employee.setName("Sachin");
        employee.setSalary(15000);
        employee.setAddresses(addresses);


        EmployeeDao eDao = new EmployeeDao();
        eDao.addEmployee(employee);
    }
}
