package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null,"lzm1234","666666","123@pp.com"));
    }

    @Test
    public void login() {
        //System.out.println(userService.login(new User(null,"ppp","1234",null)));
        System.out.println(userService.login(new User(null,"lzm123","666666",null)));
    }

    @Test
    public void existUsername() {
        if(userService.existsUsername("lzm123")){
            System.out.println("用户名存在!");
        }else{
            System.out.println("用户名可用!");
        }
    }
}