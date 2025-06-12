import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    private static final String URL = "jdbc:mysql://localhost:3306/isj013";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    @SneakyThrows
    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<Course>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from course");
        while (rs.next()) {
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setName(rs.getString("name"));
            course.setPrice(rs.getInt("price"));
            courseList.add(course);
        }
        connection.close();
        return courseList;
    }

}
