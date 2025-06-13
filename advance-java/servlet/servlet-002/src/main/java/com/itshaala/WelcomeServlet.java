package com.itshaala;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

//@WebServlet(value = "/welcome", loadOnStartup = 1)
public class WelcomeServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("WelcomeServlet::init()");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("WelcomeServlet::service()");
        PrintWriter writer = res.getWriter();
        writer.println("Welcome to First Web App : "+ LocalDateTime.now());
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("WelcomeServlet::destroy()");
    }
}
