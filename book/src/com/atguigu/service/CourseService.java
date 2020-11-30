package com.atguigu.service;

import com.google.gson.Gson;

public interface CourseService {
    /**
     * 取出所有课程
     *
     * @return
     */
    public Gson selectAll();
}
