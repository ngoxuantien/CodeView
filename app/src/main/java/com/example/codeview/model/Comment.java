package com.example.codeview.model;

import java.util.List;

public class Comment {
    public Comment() {
    }

    private int commentId,commentIdTagResponse,commentLike,commentImage;
    private String  commentName,commentContent,commentTime;
    private List<Comment>reponsList;

    public List<Comment> getReponsList() {
        return reponsList;
    }

    public void setReponsList(List<Comment> reponsList) {
        this.reponsList = reponsList;
    }

    public Comment(int commentId, int commentIdTagResponse, int commentLike, int commentImage, String commentName, String commentContent, String commentTime) {
        this.commentId = commentId;
        this.commentIdTagResponse = commentIdTagResponse;
        this.commentLike = commentLike;
        this.commentImage = commentImage;
        this.commentName = commentName;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
    }

    public Comment(int commentId, int commentIdTagResponse, int commentLike, int commentImage, String commentName, String commentContent, String commentTime, List<Comment> reponsList) {
        this.commentId = commentId;
        this.commentIdTagResponse = commentIdTagResponse;
        this.commentLike = commentLike;
        this.commentImage = commentImage;
        this.commentName = commentName;
        this.commentContent = commentContent;
        this.commentTime = commentTime;
        this.reponsList = reponsList;
    }

    public int getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(int commentImage) {
        this.commentImage = commentImage;
    }



    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCommentIdTagResponse() {
        return commentIdTagResponse;
    }

    public void setCommentIdTagResponse(int commentIdTagResponse) {
        this.commentIdTagResponse = commentIdTagResponse;
    }

    public int getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(int commentLike) {
        this.commentLike = commentLike;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

}
