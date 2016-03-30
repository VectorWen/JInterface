package com.vector.jinterface.db.model.gossip;

import com.vector.jinterface.db.model.user.User;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * author: vector.huang
 * date：2016/3/2 12:58
 */
@Entity
@Table(name = "GossipLike", schema = "dbo", catalog = "KoudaiDBV19")
public class GossipLike {
    private long id;
    private Gossip gossip;
    private User user;
    private long created;
    private int status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gossipId")
    public Gossip getGossip() {
        return gossip;
    }

    public void setGossip(Gossip gossip) {
        this.gossip = gossip;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
