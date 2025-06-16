import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
    //method types : GET, POST, DELETE, PUT
    //HttpServlet : handling HTTP protocol
    //init()
    //public service(ServletRequest, ServletResponse){}--> protected service(HttpServletRequest, HttpServletResponse)--> doXXX(HttpServletRequest, HttpServletResponse)


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Servlet Created using HttpServlet");
        writer.println("Good morning "+ LocalDateTime.now());
    }
}
