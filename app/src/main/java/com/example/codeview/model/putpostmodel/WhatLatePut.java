package com.example.codeview.model.putpostmodel;

public class WhatLatePut {
    private Boolean watchLater;
    private int idVideo,idUser;

    public WhatLatePut(Boolean isWatchLater, int idVideo, int idUser) {
        this.watchLater = isWatchLater;
        this.idVideo = idVideo;
        this.idUser = idUser;
    }

    public Boolean getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(Boolean watchLater) {
        watchLater = watchLater;
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
