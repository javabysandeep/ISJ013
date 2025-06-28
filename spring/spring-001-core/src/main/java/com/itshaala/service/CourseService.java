package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseService {

    //create the object
    private CourseDao courseDao;

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public void editCourse(Course course) {
        courseDao.editCourse(course);
    }

    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);
    }

    public Course getCourse(int id) {
        return courseDao.getCourse(id);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
