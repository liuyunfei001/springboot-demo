package com.lyf.filter;

import ch.qos.logback.core.net.SyslogOutputStream;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("SecondFilter 进入！！！");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("SecondFilter 离开！！！");
    }

    @Override
    public void destroy() {

    }
}
