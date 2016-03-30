package com.vector.jinterface.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: vector.huang
 * date：2016/3/30 10:58
 */
public class TestData {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");
    SessionFactory sf = (SessionFactory) ctx.getBean("sessionFactory");

    public static void main(String[] args) {

    }

}
