package com.itshaala;


import com.itshaala.dao.CourseDao;

public class App {
    public static void main(String[] args) {
        CourseDao dao = new CourseDao();
        dao.getCourses().forEach(System.out::println);
    }
}
