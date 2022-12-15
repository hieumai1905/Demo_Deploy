package com.example.demo_servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
// @WebServlet("/hello-servlet") co nghia la khi goi den /hello-servlet thi se goi den class nay
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + "The first program" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}