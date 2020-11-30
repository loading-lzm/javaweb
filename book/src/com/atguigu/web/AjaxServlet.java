package com.atguigu.web;

import com.atguigu.dao.impl.CourseDaoImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet {
    CourseDaoImpl courseDao = new CourseDaoImpl();

    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("  jQueryAjax == 方法调用了");
        // json格式的字符串
        Gson gson = new Gson();
        String courseJsonString = gson.toJson(courseDao.selectAll());

        resp.getWriter().write(courseJsonString);
    }

    protected void jQueryGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("  jQueryGet  == 方法调用了");
        ;
        // json格式的字符串
        Gson gson = new Gson();
        String courseJsonString = gson.toJson(courseDao.selectAll());

        resp.getWriter().write(courseJsonString);
    }

    protected void jQueryPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("  jQueryPost   == 方法调用了");
        // json格式的字符串
        Gson gson = new Gson();
        String courseJsonString = gson.toJson(courseDao.selectAll());

        resp.getWriter().write(courseJsonString);
    }


    protected void jQueryGetJSON(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("  jQueryGetJSON   == 方法调用了");
        // json格式的字符串
        Gson gson = new Gson();
        String courseJsonString = gson.toJson(courseDao.selectAll());

        resp.getWriter().write(courseJsonString);
    }

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("  jQuerySerialize   == 方法调用了");

        System.out.println("用户名：" + req.getParameter("username"));
        System.out.println("密码：" + req.getParameter("password"));

        // json格式的字符串
        Gson gson = new Gson();
        String courseJsonString = gson.toJson(courseDao.selectAll());

        resp.getWriter().write(courseJsonString);
    }


}
