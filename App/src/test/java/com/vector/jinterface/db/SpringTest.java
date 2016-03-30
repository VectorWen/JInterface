package com.vector.jinterface.db;

import com.vector.jinterface.db.model.hello.HelloHibernate;
import com.vector.jinterface.db.model.hello.HelloSpring;
import com.vector.jinterface.db.model.gossip.GossipCategory;
import com.vector.jinterface.db.model.user.User;
import com.vector.jinterface.db.model.user.UserAuthority;
import com.vector.jinterface.util.UnicodeUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Timestamp;

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

    @Test
    public void testAddUser(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_bean.xml");
        SessionFactory sf = (SessionFactory) ctx.getBean("sessionFactory");
        System.out.println(sf);

        Session session = sf.openSession();

        session.beginTransaction();

        UserAuthority auth = new UserAuthority();
        auth.setAuthority_id(4);
        User user = new User();
        user.setUsername("642378415@qq.com");
        us(user);

        auth.setUser(user);

        session.save(user);
        session.save(auth);

        session.getTransaction().commit();

        session.close();

        sf.close();
    }

    private void us(User user){
        user.setPassword("A07C8BE0F4AA3AB908A43F8DBB91734B1C059A6D1FD18D7EA706122D9F94DB439E167D607247889E38C064282809BA7C");
        user.setPwdSalt("N53A546T");

        user.setRealName(UnicodeUtils.getRandomRangeText(3,13));
        user.setSignature(UnicodeUtils.getRandomRangeText(10,30));
        user.setCreated(new Timestamp(System.currentTimeMillis()));
        user.setRemainTryTimes(10);
        user.setPic("face/guest.jpg");
        user.setSfmUid("sfm52501586067634315");
        user.setDeviceType("1");
        user.setEnabled(1);
    }

}
