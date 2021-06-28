package com.example.codeview.model.putpostmodel;

public class Likeput {
    private int isLiked;
    private int idVideo;
    private int idUser;

    public int getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(int isLiked) {
        this.isLiked = isLiked;
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

    public Likeput(int isLiked, int idVideo, int idUser) {
        this.isLiked = isLiked;
        this.idVideo = idVideo;
        this.idUser = idUser;
    }




}
