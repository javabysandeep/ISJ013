import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        PrintWriter writer = resp.getWriter();
        if (session != null) {
            writer.println("Welcome, " + session.getAttribute("username"));
        }
        writer.println("<form action=\"logout\" method=\"post\">\n" +
                "    <input type=\"submit\" value=\"Logout\">\n" +
                "</form>");
    }
}
