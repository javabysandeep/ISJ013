import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//url and servlet mapping
@WebServlet("/courses")
public class CourseServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init method");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
        CourseDao dao = new CourseDao();
        List<Course> courses = dao.getAllCourses();

        PrintWriter writer = res.getWriter();
        writer.println("List of Courses");
        writer.println(courses);
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
}
