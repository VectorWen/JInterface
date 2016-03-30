package com.vector.jinterface.db.model.gossip;

import com.vector.jinterface.db.model.user.User;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author vector.huang
 * @date 2016年2月25日 下午12:27:50
 */
@Entity
@Table(name = "Gossip", schema = "dbo", catalog = "KoudaiDBV19")
public class Gossip {

    public Gossip(){}

    /**
     * 八卦内容
     */
	private int id;
	private long created;
	private String content;
    private Set<GossipImage> images = new LinkedHashSet<GossipImage>();

    private Set<GossipComment> comments;
    private Set<GossipLike> likes;


    private int shareCount;

    /**
     * 用户及用户关系
     */
    private User user;
    @Transient
    private int userRelation;

    /**
     * 八卦分类
     */
    private GossipCategory gossipCategory;


    /**
     * 评论、收藏、点赞、分享
     */
    @Transient
    private int commentTotal;
    @Transient
    private boolean isFavorite;
    @Transient
    private boolean isLike;
    @Transient
    private int likeTotal;

    public Gossip(int gossipId) {
        this.id = gossipId;
    }

    //删除的时候一起删除了
    @OneToMany(cascade = {CascadeType.ALL},mappedBy = "gossip")
    public Set<GossipComment> getComments() {
        return comments;
    }

    public void setComments(Set<GossipComment> comments) {
        this.comments = comments;
    }

    //删除的时候一起删除了
    @OneToMany(cascade = {CascadeType.ALL},mappedBy = "gossip")
    public Set<GossipLike> getLikes() {
        return likes;
    }

    public void setLikes(Set<GossipLike> likes) {
        this.likes = likes;
    }

    @Transient
    public int getCommentTotal() {
        return commentTotal;
    }

    public void setCommentTotal(int commentTotal) {
        this.commentTotal = commentTotal;
    }

    @Transient
    public int getUserRelation() {
        return userRelation;
    }

    public void setUserRelation(int userRelation) {
        this.userRelation = userRelation;
    }
    @Transient
    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
    @Transient
    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }

    @Transient
    public int getLikeTotal() {
        return likeTotal;
    }

    public void setLikeTotal(int likeTotal) {
        this.likeTotal = likeTotal;
    }

    public int getShareCount() {
        return shareCount;
    }

    public void setShareCount(int shareCount) {
        this.shareCount = shareCount;
    }

	public String getContent() {
		return content;
	}

	public long getCreated() {
		return created;
	}

	@OneToOne
	@JoinColumn(name = "categoryId")
	public GossipCategory getGossipCategory() {
		return gossipCategory;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	@OneToMany(mappedBy = "gossip",
            cascade = { CascadeType.ALL },
            fetch = FetchType.EAGER)
    @OrderBy
	public Set<GossipImage> getImages() {
		return images;
	}

	@ManyToOne
	@JoinColumn(name = "userId")
	public User getUser() {
		return user;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public void setGossipCategory(GossipCategory gossipCategory) {
		this.gossipCategory = gossipCategory;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setImages(Set<GossipImage> images) {
		this.images = images;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
