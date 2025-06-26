package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class CourseDao {
    public List<Course> getCourses() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query<Course> query = session.createQuery("from Course where id > 1", Course.class);
        List<Course> courseList = query.list();
        return courseList;
    }
}
