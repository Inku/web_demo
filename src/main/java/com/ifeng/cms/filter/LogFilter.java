package com.ifeng.cms.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/8.
 */
@WebFilter(filterName = "log", urlPatterns = {"/*"})
public class LogFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ServletContext context = this.filterConfig.getServletContext();
        long before = System.currentTimeMillis();
        System.out.println("start filter...");
        HttpServletRequest hrequest = (HttpServletRequest) request;
        System.out.println(hrequest.getServletPath());
        chain.doFilter(request, response);
        System.out.println("end filter...");
        long after = System.currentTimeMillis();
        System.out.println("time=" + (after - before));
    }

    @Override
    public void destroy() {
        this.filterConfig = null;
    }
}
