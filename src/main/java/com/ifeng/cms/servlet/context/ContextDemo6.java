package com.ifeng.cms.servlet.context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/14.
 */
@WebServlet(name = "ContextDemo6", urlPatterns = {"/contextDemo6"})
public class ContextDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResource(response);
    }

    private void getResource(HttpServletResponse response) throws IOException {
        InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
        System.out.println(in);
        Properties prop = new Properties();
        prop.load(in);
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        PrintWriter print = response.getWriter();
        print.println(driver);
        print.println(url);
        print.println(username);
        print.println(password);
    }
}
