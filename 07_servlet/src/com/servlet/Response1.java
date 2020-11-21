package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("曾到此一游 Response1");

        //    设置相应状态码302 表示重定向 (已搬迁)
        resp.setStatus(302);
        //    设置相应头 说明 新地址在哪
        resp.setHeader("Location", "http://locahost:8080/07_servlet/response1");
        //第二种方法
        resp.sendRedirect("http://locahost:8080");
    }
}
