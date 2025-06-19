package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        Connection conn = DbConnectionUtil.getConnection();
        String query = "insert into course(name,duration,price, description) values(?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, course.getName());
            ps.setString(2, course.getDuration());
            ps.setInt(3, course.getPrice());
            ps.setString(4, course.getDescription());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        System.out.println("Course created");
    }

    public void updateCourse(Course course) {
        Connection conn = DbConnectionUtil.getConnection();
        String query = "update course set name=?, duration=?, price=?, description=? where id=?";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, course.getName());
            ps.setString(2, course.getDuration());
            ps.setInt(3, course.getPrice());
            ps.setString(4, course.getDescription());
            ps.setInt(5, course.getId());

            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        System.out.println("Course Updated");
    }

    public void deleteCourse(int courseId) {
        Connection conn = DbConnectionUtil.getConnection();
        String query = "delete from course where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, courseId);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        System.out.println("Course Deleted");
    }

    public Course getCourseById(int courseId) {
        Connection conn = DbConnectionUtil.getConnection();
        String query = "select * from course where id=?";
        Course course = null;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps = conn.prepareStatement(query);
            ps.setInt(1, courseId);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDuration(resultSet.getString("duration"));
                course.setPrice(resultSet.getInt("price"));
                course.setDescription(resultSet.getString("description"));
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        return course;
    }

    public List<Course> getAllCourses() {
        Connection conn = DbConnectionUtil.getConnection();
        String query = "select * from course";
        List<Course> courses = new ArrayList<Course>();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDuration(resultSet.getString("duration"));
                course.setPrice(resultSet.getInt("price"));
                course.setDescription(resultSet.getString("description"));
                courses.add(course);
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        return courses;
    }
}
