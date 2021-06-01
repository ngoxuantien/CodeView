package com.example.codeview.model;

import java.util.List;

public class VideoUser {
    private int videoId,videoNumberOfLike,videoNumberOfComment;
    private String videoName,videoContent,videoImageUser,videoNameUser;
    private List<String> listCategoryVideo;

    public VideoUser() {
    }

    public int getVideoNumberOfLike() {
        return videoNumberOfLike;
    }

    public void setVideoNumberOfLike(int videoNumberOfLike) {
        this.videoNumberOfLike = videoNumberOfLike;
    }

    public int getVideoNumberOfComment() {
        return videoNumberOfComment;
    }
    public String ConvertVideoNumberCommert(){
        String videoNumberOfComment;
        videoNumberOfComment=this.videoNumberOfComment+"";
        return videoNumberOfComment;
    }
    public String ConvertVideoNumberLike(){
        String videoNumberlike;
        videoNumberlike=this.videoNumberOfLike+"";
        return videoNumberlike;
    }

    public void setVideoNumberOfComment(int videoNumberOfComment) {
        this.videoNumberOfComment = videoNumberOfComment;
    }

    public VideoUser(int videoId, int videoNumberOfLike, int videoNumberOfComment, String videoName, String videoContent, String videoImageUser, String videoNameUser) {
        this.videoId = videoId;
        this.videoNumberOfLike = videoNumberOfLike;
        this.videoNumberOfComment = videoNumberOfComment;
        this.videoName = videoName;
        this.videoContent = videoContent;
        this.videoImageUser = videoImageUser;
        this.videoNameUser = videoNameUser;

    }

    public VideoUser(int videoId, String videoName, String videoContent, String videoImageUser, String videoNameUser, List<String> listCategoryVideo) {
        this.videoId = videoId;
        this.videoName = videoName;
        this.videoContent = videoContent;
        this.videoImageUser = videoImageUser;
        this.videoNameUser = videoNameUser;
        this.listCategoryVideo = listCategoryVideo;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoContent() {
        return videoContent;
    }

    public void setVideoContent(String videoContent) {
        this.videoContent = videoContent;
    }

    public String getVideoImageUser() {
        return videoImageUser;
    }

    public void setVideoImageUser(String videoImageUser) {
        this.videoImageUser = videoImageUser;
    }

    public String getVideoNameUser() {
        return videoNameUser;
    }

    public void setVideoNameUser(String videoNameUser) {
        this.videoNameUser = videoNameUser;
    }

    public List<String> getListCategoryVideo() {
        return listCategoryVideo;
    }

    public void setListCategoryVideo(List<String> listCategoryVideo) {
        this.listCategoryVideo = listCategoryVideo;
    }
}
