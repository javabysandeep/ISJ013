package com.itshaala.springbootspringjdbcapp.service;

import com.itshaala.springbootspringjdbcapp.dao.StudentDao;
import com.itshaala.springbootspringjdbcapp.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
