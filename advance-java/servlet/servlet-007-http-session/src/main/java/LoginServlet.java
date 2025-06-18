import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value = "/login", initParams = {})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html");
        if (username.equals("admin") && password.equals("admin")) {
            HttpSession session = req.getSession(true);//new session object
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            RequestDispatcher dispatcher = req.getRequestDispatcher("welcome");
            dispatcher.forward(req, resp);
        } else {
            resp.getWriter().println("Invalid credentials");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
            dispatcher.include(req, resp);
        }
        ServletConfig servletConfig = getServletConfig();

        ServletContext servletContext = getServletContext();
        servletContext.getAttribute("abc")
    }
}
