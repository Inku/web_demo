package com.ifeng.cms.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/7.
 */
@WebServlet(name = "firstServlet", urlPatterns = "/servlet/firstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String[] color = req.getParameterValues("color");
        String national = req.getParameter("country");
    }
}
