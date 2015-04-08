package com.ifeng.cms.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/8.
 */
@WebServlet(name = "ServletContextDemo1", urlPatterns = {"/servlet/context1"})
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = "this is data";
        ServletContext context = this.getServletContext();
        context.setAttribute("demo1Data", data);
        RequestDispatcher rd = context.getRequestDispatcher("/servlet/context2");
        rd.forward(request, response);
        response.getWriter().println("test");
    }
}
