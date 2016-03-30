package com.vector.jinterface.db;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: vector.huang
 * date：2016/3/30 13:32
 */
public class DataController {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");
    SessionFactory sf = (SessionFactory) ctx.getBean("sessionFactory");



}
