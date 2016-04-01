package com.vector.jinterface.db.controller;

import com.vector.jinterface.db.service.GossipService;
import com.vector.jinterface.db.service.UserService;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * author: vector.huang
 * date：2016/3/30 13:32
 */
@Controller
public class DataController {
    @Autowired
    private UserService userService;
    @Autowired
    private GossipService gossipService;

    public void addUser(SessionFactory sf) {
        int userCount = 10000;
        int userLength = 50 * 10000;
        for (int i = 1; i <= userLength / userCount; i++) {
            userService.addUser(sf, userCount, 642377415 + userCount * i);
            System.out.println("添加了 " + userCount * i + " 个用户");
        }
    }

    public void addGossipCategory(SessionFactory sf) {
        String[] categoryNames = new String[]{
                "折扣",
                "母婴",
                "购物",
                "游玩",
                "晒货"
        };
        gossipService.addGossipCategory(sf, categoryNames);
    }

    public void addGossip(SessionFactory sf) {
        int userCount = 5000;
        int userLength = 100 * 10000;
        for (int i = 1; i <= userLength / userCount; i++) {
            gossipService.addGossip(sf, userCount);
            System.out.println("添加了 " + userCount * i + " 条口袋圈");
        }
    }

    public void addComment(SessionFactory sf) {
        int userCount = 5000;
        int userLength = 100*10000;
        for (int i = 1; i <= userLength / userCount; i++) {
            gossipService.addComment(sf, userCount);
            System.out.println("添加了 " + userCount * i + " 条评论");
        }
    }

}
