package com.ifeng.cms.servlet.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/13.
 */
@WebServlet(name = "CookieDemo1", urlPatterns = {"/cookieDemo1"})
public class CookieDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("this is index");
        out.print("last time is : ");

        Cookie[] cookies = request.getCookies();
        for (int i = 0; cookies != null && i < cookies.length; i++) {
            Cookie cookie = cookies[i];
            if (cookie.getName().equals("lastAccessTime")) {
                Long time = Long.parseLong(cookie.getValue());
                Date date = new Date(time);
                out.println(date);
            }
        }

        Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis() + "");
        response.addCookie(cookie);
    }
}

