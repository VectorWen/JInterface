package com.vector.jinterface.edsc;

import com.vector.jinterface.edsc.helper.VClass;

/**
 * author: vector.huang
 * date：2016/5/24 9:42
 */
public class Test {

    public static void main(String[] args) {
        VClass classFactory = new VClass();
        classFactory.setPackageName("com.zyt.kdhk.model.gossip");
        classFactory.addImportClass("import javax.persistence.Entity;\n" +
                "import javax.persistence.Table;\n" +
                "import javax.persistence.Transient;");
        classFactory.setClassNote("/**\n" +
                " * @author vector.huang\n" +
                " * @date 2016年2月25日 下午12:27:50\n" +
                " */\n" +
                "@Entity\n" +
                "@Table(name = \"Gossip\", schema = \"dbo\", catalog = \"KoudaiDBV19\")");
        classFactory.setClassName("Gossip extends BaseGossip");
        classFactory.setClassBody("\n" +
                "    public Gossip() {\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    private int userRelation;\n" +
                "\n" +
                "    /**\n" +
                "     * 评论、收藏、点赞、分享\n" +
                "     */\n" +
                "    @Transient\n" +
                "    private int commentTotal;\n" +
                "    @Transient\n" +
                "    private boolean isFavorite;\n" +
                "    @Transient\n" +
                "    private boolean isLike;\n" +
                "    @Transient\n" +
                "    private int likeTotal;\n" +
                "\n" +
                "    public Gossip(int gossipId) {\n" +
                "        setId(gossipId);\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    public int getCommentTotal() {\n" +
                "        return commentTotal;\n" +
                "    }\n" +
                "\n" +
                "    public void setCommentTotal(int commentTotal) {\n" +
                "        this.commentTotal = commentTotal;\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    public int getUserRelation() {\n" +
                "        return userRelation;\n" +
                "    }\n" +
                "\n" +
                "    public void setUserRelation(int userRelation) {\n" +
                "        this.userRelation = userRelation;\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    public boolean isFavorite() {\n" +
                "        return isFavorite;\n" +
                "    }\n" +
                "\n" +
                "    public void setFavorite(boolean favorite) {\n" +
                "        isFavorite = favorite;\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    public boolean isLike() {\n" +
                "        return isLike;\n" +
                "    }\n" +
                "\n" +
                "    public void setLike(boolean like) {\n" +
                "        isLike = like;\n" +
                "    }\n" +
                "\n" +
                "    @Transient\n" +
                "    public int getLikeTotal() {\n" +
                "        return likeTotal;\n" +
                "    }\n" +
                "\n" +
                "    public void setLikeTotal(int likeTotal) {\n" +
                "        this.likeTotal = likeTotal;\n" +
                "    }\n" +
                "\n");
        System.out.println(classFactory.string());
    }
}
