package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/editCourse")
public class EditCourseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String duration = req.getParameter("duration");
        int price = Integer.parseInt(req.getParameter("price"));
        String description = req.getParameter("description");

        Course course = Course.builder()
                .id(id)
                .name(name)
                .duration(duration)
                .price(price)
                .description(description)
                .build();

        CourseService courseService = new CourseService();
        courseService.updateCourse(course);
        resp.getWriter().println("Course Updated Successfully");
    }
}
