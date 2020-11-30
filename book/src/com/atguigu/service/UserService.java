package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.ArrayList;

public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     */
    public void registUser(User user);

    /**
     * 登录
     * @param user
     */
    public User login(User user);

    /**
     * 检查用户名是否可用
     * @param username
     * @return 返回true表示用户名已存在,返回false表示用户名可用
     */
    public boolean existsUsername(String username);

    /**
     * 用户修改密码
     *
     * @param
     * @return
     */
    public boolean changePassword(String username, String password, String oldpassword);

    /**
     * 查找所有用户
     *
     * @return
     */
    public ArrayList<User> selectAll();

}
