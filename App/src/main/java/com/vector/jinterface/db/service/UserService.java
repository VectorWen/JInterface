package com.vector.jinterface.db.service;

import com.vector.jinterface.db.model.user.User;
import com.vector.jinterface.db.model.user.UserAuthority;
import com.vector.jinterface.util.UnicodeUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * author: vector.huang
 * date：2016/3/30 14:34
 */
@Service
public class UserService {

    public void addUser(SessionFactory sf,int size,int usernameStart){
        Session session = sf.openSession();
        session.beginTransaction();

        for(int i=0;i<size;i++){
            UserAuthority auth = new UserAuthority();
            auth.setAuthority_id(4);
            User user = new User();
            int username = usernameStart + i;
            user.setUsername(username+"@qq.com");
            us(user);
            auth.setUser(user);
            session.save(user);
            session.save(auth);
        }
        session.getTransaction().commit();
        session.close();
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
