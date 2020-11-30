package com.atguigu.dao.impl;

import com.atguigu.dao.CourseDao;
import com.atguigu.pojo.Course;

import java.util.List;

public class CourseDaoImpl extends BaseDao implements CourseDao {
    @Override
    public int update(String sql, Object... args) {
        return super.update(sql, args);
    }

    @Override
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        return super.queryForOne(type, sql, args);
    }

    @Override
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        return super.queryForList(type, sql, args);
    }

    @Override
    public Object queryForSingleValue(String sql, Object... args) {
        return super.queryForSingleValue(sql, args);
    }

    @Override
    public List<Course> selectAll() {
        String sql = "SELECT * FROM course";
        return queryForList(Course.class, sql);
    }
}