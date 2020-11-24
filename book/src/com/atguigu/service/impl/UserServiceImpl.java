package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if(userDao.queryUserByUsername(username)==null){
            //是否存在用户名,没有查到所以返回false
            return false;
        }
        //查到了返回true
        return true;
    }

    @Override
    public boolean changePassword(String username,String password,String oldpassword){
        User user = userDao.queryUserByUsernameAndPassword(username,oldpassword);
        if(user!=null){
            userDao.changePassword(user,password);
            return true;
        }
        return false;
    }
}
