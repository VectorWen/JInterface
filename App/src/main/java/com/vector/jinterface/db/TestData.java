package com.vector.jinterface.db;

import com.vector.jinterface.db.controller.DataController;

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

    public void start() {
        DataController dataController = ctx.getBean(DataController.class);
        long start,end;

        /*start = System.currentTimeMillis();
        System.out.println("添加用户 - start " + start);
        dataController.addUser(sf);
        end = System.currentTimeMillis();
        System.out.println("添加用户 - end" + end);
        System.out.println("耗时 ：" + (end - start));*/

        /*start = System.currentTimeMillis();
        System.out.println("添加分类 - start " + start);
        dataController.addGossipCategory(sf);
        end = System.currentTimeMillis();
        System.out.print("添加分类 - end" + end);
        System.out.println("，耗时 ：" + (end - start));*/

       /* start = System.currentTimeMillis();
        System.out.println("添加口袋圈 - start " + start);
        dataController.addGossip(sf);
        end = System.currentTimeMillis();
        System.out.print("添加口袋圈 - end" + end);
        System.out.println("，耗时 ：" + (end - start));*/

        start = System.currentTimeMillis();
        System.out.println("添加评论 - start " + start);
        dataController.addComment(sf);
        end = System.currentTimeMillis();
        System.out.print("添加评论 - end" + end);
        System.out.println("，耗时 ：" + (end - start));

    }

    public static void main(String[] args) {
        new TestData().start();
    }

}
