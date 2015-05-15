package com.ifeng.cms.servlet.context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/14.
 */
@WebServlet(name = "ContextDemo5", urlPatterns = {"/contextDemo5"})
public class ContextDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("demo5");
        System.out.println("contextDemo5");
    }
}
