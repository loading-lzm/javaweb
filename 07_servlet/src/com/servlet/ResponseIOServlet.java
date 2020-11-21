package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //System.out.println(resp.getCharacterEncoding());//默认为ISO-8859-1

        /*
        这是第一种方法
        //设置服务器字符集为UTF-8    显示还是不行  原因是只设置了服务器字符集   没有设置浏览器
        resp.setCharacterEncoding("UTF-8");

        //通过相应头,设置浏览器页使用UTF-8
        resp.setHeader("Content-Type", "text/html;charset-UTF-8");
        */

        /*
        * 这是第二种方法
        * 同时设置服务器和客户端都使用UTF-8字符集,还设置了响应头
        * 此方法一定要在获取对象之前调用才有效
        * resp.setContentType("text/html;charset=UTF-8");
        */

        //要求:向客户端回传 字符串 数据
        PrintWriter writer = resp.getWriter();
        writer.write("response's content!!!");

        //无法正常显示
        writer.write("这是一段中文");
    }
}
