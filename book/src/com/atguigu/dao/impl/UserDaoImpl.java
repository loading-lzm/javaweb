package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where username = ? and password = ?";
        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into t_user(`username`,`password`,`email`) values(?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public int changeUserPassword(User user, String password) {
        String sql = "update t_user set password = ? where username= ? ";
        //String sql = "insert into t_user(`username`,`password`,`email`) values(?,?,?)";
        return update(sql, password, user.getUsername());
    }

    @Override
    public List<User> selectAll() {
        String sql = "SELECT * FROM t_user";
        return queryForList(User.class, sql);
    }
}