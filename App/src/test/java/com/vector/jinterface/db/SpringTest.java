package com.vector.jinterface.db;

import com.vector.jinterface.db.model.hello.HelloHibernate;
import com.vector.jinterface.db.model.hello.HelloSpring;
import com.vector.jinterface.db.model.gossip.GossipCategory;
import com.vector.jinterface.db.model.user.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: vector.huang
 * date：2016/3/30 9:33
 */
public class SpringTest {

    @Test
    public void testHelloSpring(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");
        HelloSpring hello = (HelloSpring) ctx.getBean("helloSpring");
        System.out.println(hello.getName());
    }

    @Test
    public void testHelloHibernate(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");
        SessionFactory sf = (SessionFactory) ctx.getBean("sessionFactory");
        System.out.println(sf);

        Session session = sf.openSession();

        /*GossipCategory category = new GossipCategory();
        category.setName("nice");
        category.setCreated(System.currentTimeMillis());
        User user = new User();
        user.setId(1);
        category.setUser(user);
        session.save(user);*/

        HelloHibernate hibernate = new HelloHibernate();
        hibernate.setName("我就是一个名字罢了。");
        session.beginTransaction();
        session.save(hibernate);
        session.getTransaction().commit();
        session.close();

        sf.close();
    }

}
