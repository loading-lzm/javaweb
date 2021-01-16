package com.atguigu.pojo;

public class Course {
    private int id;
    private String name;
    private String time;
    private int number;
    private String teacher;
    private String position;

    public Course() {
    }

    public Course(int id, String name, String time, int number, String teacher, String position) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.number = number;
        this.teacher = teacher;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", number=" + number +
                ", teacher='" + teacher + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
