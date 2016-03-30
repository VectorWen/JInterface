package com.vector.jinterface.db.model.gossip;

import com.vector.jinterface.db.model.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vector.huang
 * @date 2016年3月1日 下午3:55:46
 */
@Entity
@Table(name = "GossipComment", schema = "dbo", catalog = "KoudaiDBV19")
public class GossipComment {

	private long id;
	private Gossip gossip;
	private User beReplyUser;//被回复的用户
	private User user;
	private String content;
	private long created;

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "gossipId")
    public Gossip getGossip() {
        return gossip;
    }

    public void setGossip(Gossip gossip) {
        this.gossip = gossip;
    }

    @ManyToOne
    @JoinColumn(name = "beReplyUserId")
    public User getBeReplyUser() {
        return beReplyUser;
    }

    public void setBeReplyUser(User beReplyUser) {
        this.beReplyUser = beReplyUser;
    }

    @ManyToOne
    @JoinColumn(name = "userId")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}
