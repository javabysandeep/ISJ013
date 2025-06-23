package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        Connection conn = ConnectionUtil.getConnection();
        String sql = "INSERT INTO course(name, duration,price,description) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, course.getName());
            ps.setString(2, course.getDuration());
            ps.setInt(3, course.getPrice());
            ps.setString(4, course.getDescription());
            ps.executeUpdate();
            System.out.println("course added successfully");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }

    }

    public void updateCourse(Course course) {
        Connection conn = ConnectionUtil.getConnection();
        String sql = "update course set name=?, duration=?,price=?,description=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, course.getName());
            ps.setString(2, course.getDuration());
            ps.setInt(3, course.getPrice());
            ps.setString(4, course.getDescription());
            ps.setInt(5, course.getId());
            ps.executeUpdate();
            System.out.println("course updated successfully");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }

    }

    public void deleteCourse(int id) {
        Connection conn = ConnectionUtil.getConnection();
        String sql = "delete from course where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("course deleted successfully");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }

    }

    public Course getCourse(int id) {
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select * from course where id=?";
        Course course = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDuration(resultSet.getString("duration"));
                course.setPrice(resultSet.getInt("price"));
                course.setDescription(resultSet.getString("description"));
            }
            System.out.println("course updated successfully");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        return course;
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        Connection conn = ConnectionUtil.getConnection();
        String sql = "select * from course";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
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
            System.out.println("course updated successfully");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        return courses;
    }

}
