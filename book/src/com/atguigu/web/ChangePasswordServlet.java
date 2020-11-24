package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangePasswordServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String oldpassword = req.getParameter("oldpassword");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
        //检查验证码是否正确
        if ("abcde".equalsIgnoreCase(code)) {
            //检查用户名是否存在
            if (!userService.existsUsername(username)) {
                System.out.println("用户名不存在");
                //跳转改密码页面
                req.getRequestDispatcher("/pages/user/changePassword.html").forward(req, resp);
            } else {
                if(userService.changePassword(username, password, oldpassword)){
                    System.out.println("修改成功");
                    req.getRequestDispatcher("/pages/user/login_success.html").forward(req, resp);
                }else{
                    System.out.println("账户名或密码错误");
                    req.getRequestDispatcher("/pages/user/changePassword.html").forward(req, resp);
                }

            }
        }
    }

}
