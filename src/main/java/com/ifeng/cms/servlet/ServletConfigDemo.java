package com.ifeng.cms.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/13.
 */
public class ServletConfigDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        ServletConfig config = this.getServletConfig();
        Enumeration<String> en = config.getInitParameterNames();
        while (en.hasMoreElements()) {
            String name = en.nextElement();
            String value = config.getInitParameter(name);
            out.println(name + "-->" + value);
        }
    }
}
