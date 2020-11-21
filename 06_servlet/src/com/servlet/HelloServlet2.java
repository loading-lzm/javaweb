package com.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("重新init初始化方法,做了一些工作");
    }
    //重写了init方法之后   一定要调用super方法

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2 的doGet方法");
        //也可以使用
        ServletConfig servletConfig = getServletConfig();

        //2.获取初始化参数 init-param  初始值为 null   只能得到自己的
        System.out.println("初始化参数username的值是:" + servletConfig.getInitParameter("username"));
        System.out.println("初始化参数url的值是:" + servletConfig.getInitParameter("url"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2 的doPost方法");
    }
}