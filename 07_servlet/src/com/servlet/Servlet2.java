package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数(办事的材料)查看
        String username = req.getParameter("username");
        System.out.println("在Servlet2(柜台2)中查看参数(材料):"+username);

        //查看 柜台1 是否盖章
        String key1 = req.getParameter("key1");
        System.out.println("柜台1是否有章" + key1);

        //处理自己的事务
        System.out.println("Servlet2 处理自己的shiwu");

    }
}
