package com.ifeng.cms.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/8.
 */
@WebServlet(name = "ServletDemo" , urlPatterns = {"/servlet/servletDemo"})
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void refreshTest(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Content-Type", "image/jpeg");
        response.setHeader("refresh", "3");
    }

    public void picTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-Type", "image/jpeg");

        InputStream in = this.getServletContext().getResourceAsStream("/1.jpg");
        OutputStream out = response.getOutputStream();

        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
    }

    public void gzipTest(HttpServletResponse response) throws IOException {
        String data = "this is data";

        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        GZIPOutputStream gout = new GZIPOutputStream(bout);
        gout.write(data.getBytes());
        gout.close();

        byte[] g = bout.toByteArray();

        response.setHeader("Content-Encoding", "gzip");
        response.setHeader("Content-Length", g.length + "");
        response.getOutputStream().write(g);
    }
}
