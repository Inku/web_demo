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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/13.
 */
@WebServlet(name = "CookieDemo4", urlPatterns = {"/cookieDemo4"})
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        out.print("book is :<br/>");
        String id = request.getParameter("id");
        Book book = SimuDB.getAll().get(id);
        out.println(book.getName() + "<br/>");
        out.println(book.getAuthor() + "<br/>");
        out.println(book.getDescription() + "<br/>");
        out.println(book.getId() + "<br/>");

        String bookHistory = makeHistory(request, id);
        Cookie cookie = new Cookie("bookHistory", bookHistory);
        response.addCookie(cookie);
    }

    private String makeHistory(HttpServletRequest request, String id) {
        String bookHistory = null;
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("bookHistory")) {
                bookHistory = cookie.getValue();
            }
        }

        if (bookHistory == null || bookHistory.equals("")) {

            return id;
        }

        LinkedList<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(bookHistory.split("_")));
        if (list.contains(id)) {
            list.remove(list.indexOf(id));
            list.addFirst(id);
        } else {
            if (list.size() >= 3) {
                list.removeLast();
                list.addFirst(id);
            } else {
                list.addFirst(id);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String lid : list) {
            sb.append(lid).append("_");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}

