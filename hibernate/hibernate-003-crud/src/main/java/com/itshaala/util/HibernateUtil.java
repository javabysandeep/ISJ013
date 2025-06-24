package com.itshaala.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Configuration cfg = new Configuration();

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            cfg.configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory;
    }
}
