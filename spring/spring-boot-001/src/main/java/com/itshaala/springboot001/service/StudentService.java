package com.itshaala.springboot001.service;

import com.itshaala.springboot001.dao.StudentDao;
import com.itshaala.springboot001.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {
    private StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
}
