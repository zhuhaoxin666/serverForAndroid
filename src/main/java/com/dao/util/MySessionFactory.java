package com.dao.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {

    private MySessionFactory(){}

    private static SessionFactory sessionFactory;

    static {
        if(sessionFactory == null)
            sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
