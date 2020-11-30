package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class UserListServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<User> users = userService.selectAll();
        Gson gson = new Gson();
        String UserJsonString = gson.toJson(users);
        resp.getWriter().write(UserJsonString);
        //req.setAttribute("users", users);
        //req.getRequestDispatcher("../web/list.jsp").forward(req, resp);
    }
}
