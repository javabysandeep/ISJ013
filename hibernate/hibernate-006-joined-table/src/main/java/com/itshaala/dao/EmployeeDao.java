package com.itshaala.dao;

import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
    public void addEmployee(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(employee);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee added successfully");
    }

    public void updateEmployee(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //transaction is required for non-select queries
        Transaction transaction = session.beginTransaction();
        Employee fetchedEmployee = session.find(Employee.class, employee.getId());
        if (fetchedEmployee != null) {
            session.merge(employee);
            System.out.println("Empoloyee updated successfully");
            transaction.commit();
        } else {
            System.out.println("Employee not found");
        }
        session.close();
        sessionFactory.close();

    }

    public void deleteEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee fetchedEmployee = session.find(Employee.class, employee.getId());
        if (fetchedEmployee != null) {
            Transaction transaction = session.beginTransaction();
            session.remove(employee);
            System.out.println("Employee deleted successfully");
            transaction.commit();
        } else {
            System.out.println("Employe not found");
        }
        session.close();
    }

    public Employee getEmployeeById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee fetchedEmployee = session.find(Employee.class, id);
        session.close();
        return fetchedEmployee;
    }

}
