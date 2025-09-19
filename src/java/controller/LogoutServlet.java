package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false); 
        if (session != null) {
            session.invalidate(); 
        }
        resp.sendRedirect(req.getContextPath() + "/index.jsp"); // back to login
    }
}
