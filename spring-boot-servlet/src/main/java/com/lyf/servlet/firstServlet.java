package com.lyf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * springboot 配置 servlet使用实例方法一
 * webServlet(name="类名",urlPatterns="拦截路径")
 * 相当于spring 中xml配置文件中配置servlet时的<name>servlet类名</name>和<url-Patterns>servlet拦截路径</url-Patterns>
 */
@WebServlet(name = "firstServlet",urlPatterns = "/first")
public class firstServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request,response);
        System.out.println("firstServlet已经加载！");
    }
}

