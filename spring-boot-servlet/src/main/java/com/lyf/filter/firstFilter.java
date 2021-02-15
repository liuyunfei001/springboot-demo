package com.lyf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * springboot 整合Filter 方法一
 * @WebFilter(filterName = "类名",urlPatterns = {"拦截路径"})可以单个可以数组多个
 *  * 相当于spring 中xml配置文件中配置filter时的<name>filter类名</name>和<url-Patterns>filter拦截路径</url-Patterns>
 *  servlet 与 filter 的拦截路径相同时先进行 filter 再进入  servlet
 */
//@WebFilter(filterName = "firstFilter",urlPatterns = {*.do,*.jsp})
@WebFilter(filterName = "firstFilter",urlPatterns = "/first")
public class firstFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       System.out.println("firstFilter 进入！！！");
       //servlet 的拦截放行处理
       filterChain.doFilter(servletRequest,servletResponse);
       System.out.println("firstFilter 离开！！！");
    }

    @Override
    public void destroy() {

    }
}
