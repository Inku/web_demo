package com.ifeng.cms.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/5/21.
 */
@WebServlet(name = "SessionDemo1", urlPatterns = "/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("data", "asdfasdf");

        String sessionid = session.getId();
        Cookie cookie = new Cookie("JSESSIONID", sessionid);
        cookie.setMaxAge(3600);
        response.addCookie(cookie);
    }
}
