package com.itshaala;


import com.itshaala.dao.EmployeeDao;
import com.itshaala.model.ContractEmployee;
import com.itshaala.model.Employee;
import com.itshaala.model.FullTimeEmployee;

public class App {
    public static void main(String[] args) {
        ContractEmployee employee = new ContractEmployee();
        employee.setName("Pratham");
        employee.setInvoiceAmount(60000);
        EmployeeDao eDao = new EmployeeDao();
        eDao.addEmployee(employee);
    }
}
