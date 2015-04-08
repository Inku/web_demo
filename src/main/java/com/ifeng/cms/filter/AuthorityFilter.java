package com.ifeng.cms.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Copyright ©Inku All Rights Reserved.
 * Created by zhengpeng on 15/4/8.
 */
public class AuthorityFilter implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String encoding = config.getInitParameter("encoding");
        String loginPage = config.getInitParameter("loginPage");
        String proLogin = config.getInitParameter("proLogin");
        request.setCharacterEncoding(encoding);
        HttpServletRequest hrequ = (HttpServletRequest) request;
        HttpSession session = hrequ.getSession(true);
        String requestpath = hrequ.getServletPath();
        if (session.getAttribute("user") == null && !requestpath.endsWith(loginPage) && !requestpath.endsWith(proLogin)) {
            request.setAttribute("tip", "not login");
            request.getRequestDispatcher(loginPage).forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        this.config = null;
    }
}
