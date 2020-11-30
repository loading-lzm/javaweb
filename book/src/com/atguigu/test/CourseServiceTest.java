package com.atguigu.test;

import com.atguigu.service.CourseService;
import com.atguigu.service.impl.CourseServiceImpl;
import org.junit.Test;

public class CourseServiceTest {

    CourseService CourseService = new CourseServiceImpl();

    @Test
    public void selectAll() {
        System.out.println(CourseService.selectAll());
    }
}