package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class CourseDao {

    //object1
    //object2
    //object.....................................
    //JdbcTemplate ---> jdbc crud

    public void addCourse(Course course) {
        System.out.println("courses added");
    }

    public void editCourse(Course course) {
        System.out.println("courses updated");
    }

    public void deleteCourse(Course course) {
        System.out.println("courses deleted");
    }

    public Course getCourse(int id) {
        System.out.println("courses retrieved");
        return null;
    }

    public List<Course> getAllCourses() {
        System.out.println("courses retrieved");
        return null;
    }
}
