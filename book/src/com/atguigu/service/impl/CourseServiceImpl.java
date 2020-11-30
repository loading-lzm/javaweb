package com.atguigu.service.impl;

import com.atguigu.dao.CourseDao;
import com.atguigu.dao.impl.CourseDaoImpl;
import com.atguigu.service.CourseService;
import com.google.gson.Gson;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao = new CourseDaoImpl();

    @Override
    public Gson selectAll() {
        Gson gson = new Gson();
        String personListJsonString = gson.toJson(courseDao.selectAll());
        //System.out.println(personListJsonString);
        return null;
        //return personListJsonString;
    }
    //@Test
    //public void test2() {
    //    List<Person> personList = new ArrayList<>();
    //
    //    personList.add(new Person(1, "国哥"));
    //    personList.add(new Person(2, "康师傅"));
    //
    //    Gson gson = new Gson();
    //
    //    // 把List转换为json字符串
    //    String personListJsonString = gson.toJson(personList);
    //    System.out.println(personListJsonString);
    //
    //    List<Person> list = gson.fromJson(personListJsonString, new PersonListType().getType());
    //    System.out.println(list);
    //    Person person = list.get(0);
    //    System.out.println(person);
    //}
}
