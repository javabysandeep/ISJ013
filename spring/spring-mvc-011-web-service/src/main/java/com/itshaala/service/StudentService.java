package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import com.itshaala.util.HibernateUtil;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
