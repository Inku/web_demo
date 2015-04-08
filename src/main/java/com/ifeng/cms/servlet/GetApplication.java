package com.ifeng.cms.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/3.
 */
@WebServlet(name = "get-application",urlPatterns = "/sevlet/get-application")
public class GetApplication extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>");
        out.println("test app");
        out.println("</title></head><body>");
        ServletContext sc = getServletConfig().getServletContext();
        out.println("counter:" + sc.getAttribute("counter"));
        out.println("</body></html>");
    }
}
