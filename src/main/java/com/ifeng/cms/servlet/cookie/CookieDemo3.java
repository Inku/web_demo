package com.ifeng.cms.servlet.cookie;

import com.ifeng.cms.module.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/13.
 */
@WebServlet(name = "CookieDemo3", urlPatterns = {"/cookieDemo3"})
public class CookieDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.println("books:<br/>");
        Set<Map.Entry<String, Book>> set = SimuDB.getAll().entrySet();
        for (Map.Entry<String, Book> me : set) {
            Book book = me.getValue();
            out.print("<a href='/web-demo/cookieDemo4?id=" + book.getId() + "'>" + book.getName() + "</a>");
            out.println("<br/>");
        }

        out.print("<br/>history is :<br/>");
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("bookHistory")) {
                String bookHistory = cookie.getValue();
                String[] ids = bookHistory.split("_");
                for (String id : ids) {
                    Book book = SimuDB.getAll().get(id);
                    out.print(book.getName()+"<br/>");
                }
            }
        }
    }
}

