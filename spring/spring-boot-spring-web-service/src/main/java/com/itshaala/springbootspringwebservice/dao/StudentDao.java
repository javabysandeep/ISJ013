package com.itshaala.springbootspringwebservice.dao;

import com.itshaala.springbootspringwebservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}
