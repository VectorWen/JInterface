package com.vector.jinterface.db.model.gossip;

/**
 * author: vector.huang
 * date：2016/3/7 11:13
 */
public class GossipDetail {
    /**
     * 八卦内容
     */
    private int  gossipId;
    private long created;
    private String gossipContent;
    private String [] images;

    /**
     * 用户及用户关系
     */
    private long userId;
    private String headPic;
    private String username;
    private int userRelation;

    /**
     * 八卦分类
     */
    private String gossipCategoryName;

    /**
     * 评论、收藏、点赞、分享
     */
    private int commentTotal;
    private boolean isFavorite;
    private boolean isLike;
    private int likeTotal;
    private int shareTotal;

    public int getGossipId() {
        return gossipId;
    }

    public void setGossipId(int gossipId) {
        this.gossipId = gossipId;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getGossipCategoryName() {
        return gossipCategoryName;
    }

    public void setGossipCategoryName(String gossipCategoryName) {
        this.gossipCategoryName = gossipCategoryName;
    }

    public int getUserRelation() {
        return userRelation;
    }

    public void setUserRelation(int userRelation) {
        this.userRelation = userRelation;
    }

    public String getGossipContent() {
        return gossipContent;
    }

    public void setGossipContent(String gossipContent) {
        this.gossipContent = gossipContent;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public int getCommentTotal() {
        return commentTotal;
    }

    public void setCommentTotal(int commentTotal) {
        this.commentTotal = commentTotal;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }

    public int getLikeTotal() {
        return likeTotal;
    }

    public void setLikeTotal(int likeTotal) {
        this.likeTotal = likeTotal;
    }

    public int getShareTotal() {
        return shareTotal;
    }

    public void setShareTotal(int shareTotal) {
        this.shareTotal = shareTotal;
    }
}
