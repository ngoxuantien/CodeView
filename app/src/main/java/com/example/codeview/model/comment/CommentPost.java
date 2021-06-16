package com.example.codeview.model.comment;

public class CommentPost {
    private String content, discriminator, like;
    private int userId, videoId, parentCmtId;

    public CommentPost(String content, String discriminator, String like, int userId, int videoId, int parentCmtId) {
        this.content = content;
        this.discriminator = discriminator;
        this.like = like;
        this.userId = userId;
        this.videoId = videoId;
        this.parentCmtId = parentCmtId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getParentCmtId() {
        return parentCmtId;
    }

    public void setParentCmtId(int parentCmtId) {
        this.parentCmtId = parentCmtId;
    }
}