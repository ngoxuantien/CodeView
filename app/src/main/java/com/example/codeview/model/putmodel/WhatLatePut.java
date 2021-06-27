package com.example.codeview.model.putmodel;

public class WhatLatePut {
    private Boolean isWatchLater;
    private int idVideo,idUser;

    public WhatLatePut(Boolean isWatchLater, int idVideo, int idUser) {
        this.isWatchLater = isWatchLater;
        this.idVideo = idVideo;
        this.idUser = idUser;
    }

    public Boolean getWatchLater() {
        return isWatchLater;
    }

    public void setWatchLater(Boolean watchLater) {
        isWatchLater = watchLater;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
