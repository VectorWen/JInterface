package com.vector.jinterface.db.service;

import com.vector.jinterface.db.constant.Constants;
import com.vector.jinterface.db.model.gossip.Gossip;
import com.vector.jinterface.db.model.gossip.GossipCategory;
import com.vector.jinterface.db.model.gossip.GossipComment;
import com.vector.jinterface.db.model.gossip.GossipImage;
import com.vector.jinterface.db.model.user.User;
import com.vector.jinterface.util.RandomUtils;
import com.vector.jinterface.util.UnicodeUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * author: vector.huang
 * date：2016/3/30 15:27
 */
@Service
public class GossipService {

    public void addGossipCategory(SessionFactory sf, String[] categoryNames) {
        Session session = sf.openSession();
        session.beginTransaction();
        User admin = new User();
        admin.setId(1);
        for (String name : categoryNames) {
            GossipCategory category = new GossipCategory();
            category.setUser(admin);
            category.setCreated(System.currentTimeMillis());
            category.setName(name);
            session.save(category);
        }
        session.getTransaction().commit();
        session.close();
    }

    public void addGossip(SessionFactory sf, int size) {
        Session session = sf.openSession();
        session.beginTransaction();
        for (int g = 0; g < size; g++) {
            Gossip gossip = new Gossip();
            User user = new User();
            user.setId(RandomUtils.getRandom(Constants.USER_ID_START, Constants.USER_ID_END));
            gossip.setUser(user);

            gossip.setCreated(System.currentTimeMillis() - RandomUtils.getRandom(0, 366 * 24 * 60 * 60 * 1000));
            gossip.setContent(UnicodeUtils.getRandomRangeText(10, 1000));

            GossipCategory category = new GossipCategory();
            category.setId(RandomUtils.getRandom(Constants.CATEGORY_ID_START, Constants.CATEGORY_ID_END));
            gossip.setGossipCategory(category);

            int imageCount = RandomUtils.getRandom(0, 9);
            Set<GossipImage> images = new HashSet<>(imageCount);
            for (int i = 0; i < imageCount; i++) {
                GossipImage image = new GossipImage();
                image.setGossip(gossip);
                image.setUrl("gossip/" + RandomUtils.getRandom(0, 99) + ".png");
                images.add(image);
            }
            gossip.setImages(images);
            session.save(gossip);
        }
        session.getTransaction().commit();
        session.close();
    }

    public void addComment(SessionFactory sf, int size){
        Session session = sf.openSession();
        session.beginTransaction();
        for (int c = 0; c < size; c++) {
            GossipComment comment = new GossipComment();
            Gossip gossip = new Gossip();
            int  gossipId = RandomUtils.getRandom(Constants.GOSSIP_ID_START, Constants.GOSSIP_ID_END);
            gossip.setId(gossipId);
            comment.setGossip(gossip);
            User user = new User();
            user.setId(RandomUtils.getRandom(Constants.USER_ID_START, Constants.USER_ID_END));
            comment.setUser(user);

            comment.setCreated(System.currentTimeMillis() - RandomUtils.getRandom(0, 366 * 24 * 60 * 60 * 1000));
            comment.setContent(UnicodeUtils.getRandomRangeText(10, 100));
            if(RandomUtils.getRandom(1,2) == 1){
                User user1 = new User();
                user1.setId(RandomUtils.getRandom(Constants.USER_ID_START, Constants.USER_ID_END));
                comment.setBeReplyUser(user1);
            }
            session.save(comment);
        }
        session.getTransaction().commit();
        session.close();
    }

}
