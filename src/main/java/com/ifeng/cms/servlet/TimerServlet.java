package com.ifeng.cms.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.swing.*;
import java.util.Date;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/7.
 */
@WebServlet(name = "timer", loadOnStartup = 1)
public class TimerServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        Timer t = new Timer(1000, e -> System.out.println(new Date()));
        t.start();
    }
}
