package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数
        System.out.println("---POST---");
        //设置结果的请求字符,从而解决乱码问题
        request.setCharacterEncoding("UTF-8");
        String username1 = request.getParameter("username");
        String password1 = request.getParameter("password");
        String[] hobby1 = request.getParameterValues("hobby");

        System.out.println("用户名:" + username1);
        System.out.println("密码:" + password1);
        System.out.println("兴趣爱好:" + Arrays.asList(hobby1));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数
        System.out.println("---GET---");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");

        System.out.println("用户名:" + username);
        System.out.println("密码:" + password);
        System.out.println("兴趣爱好:" + Arrays.asList(hobby));
    }
}
