package com.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    //    第一二布是在第一次访问时只会运行一次
    public HelloServlet() {
        System.out.println("1 构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2 初始化方法");

//    1.可以获取Servlet程序的别名    servlet-name的值
        System.out.println("HelloServlet程序的别名是:" + servletConfig.getServletName());
//    2.获取初始化参数 init-param
        System.out.println("初始化参数username的值是:" + servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:" + servletConfig.getInitParameter("url"));
//    3.获取ServletContext对象
        System.out.println(servletConfig.getServletContext());

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
//    service 方法专门用来处理请求和相应
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        每次访问都会调用
        System.out.println("3 Hello Servlet 被访问了");
//        类型转换(因为它有getMethod方法)
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        获取请求方式
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)) {
            System.out.println("GET请求");
        } else if ("POST".equals(method)) {
            System.out.println("POST请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
//        停止时候才会执行
        System.out.println("4 销毁方法");
    }
}
