import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        if("admin".equals(username) && "admin".equals(password)) {
            //login validated--> WelcomePage
            RequestDispatcher rd = req.getRequestDispatcher("welcome");
            rd.forward(req,resp);
        } else {
            //invalid credentials ---> Login page
            resp.getWriter().println("Invalid username or password");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req,resp);
        }
    }
}
