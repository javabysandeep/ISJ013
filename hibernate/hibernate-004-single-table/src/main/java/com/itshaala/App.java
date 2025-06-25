package com.itshaala;


import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.Employee;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Pravin");
        EmployeeDao eDao = new EmployeeDao();
        eDao.addEmployee(employee);
    }
}
