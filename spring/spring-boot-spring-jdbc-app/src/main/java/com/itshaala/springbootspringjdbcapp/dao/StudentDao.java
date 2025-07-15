package com.itshaala.springbootspringjdbcapp.dao;

import com.itshaala.springbootspringjdbcapp.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class StudentDao {
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        RowMapper<Student> rowMapper = (rs, rowNum) -> {
            Student student = Student.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .age(rs.getInt("age"))
                    .address(rs.getString("address"))
                    .build();
            return student;
        };
        List<Student> studentList = jdbcTemplate.query("select * from student", rowMapper);
        return studentList;
    }
}
