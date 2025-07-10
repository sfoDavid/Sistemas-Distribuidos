package com.ejb1;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @EJB
    private HelloBean helloBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = "usuário";
        }
        response.getWriter().write(helloBean.sayHello(name));
    }
}
