package com.atguigu.test;

import com.atguigu.dao.CourseDao;
import com.atguigu.dao.impl.CourseDaoImpl;
import org.junit.Test;

public class CourseDaoTest {
    CourseDao courseDao = new CourseDaoImpl();

    @Test
    public void selectAll() {
        System.out.println(courseDao.selectAll());
    }
}
