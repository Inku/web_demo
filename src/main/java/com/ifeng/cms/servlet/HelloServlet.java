package com.ifeng.cms.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/8.
 */
@WebServlet(name = "helloServlet", urlPatterns = {"/servlet/helloServlet"})
public class HelloServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String str = "hello servlet1";
        OutputStream out = res.getOutputStream();
        out.write(str.getBytes());
        out.flush();
    }
}
