package com.example.codeview.model.putpostmodel;

public class PostFollower {
    private String idUser,idFollower;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdFollower() {
        return idFollower;
    }

    public void setIdFollower(String idFollower) {
        this.idFollower = idFollower;
    }

    public PostFollower(String idUser, String idFollower) {
        this.idUser = idUser;
        this.idFollower = idFollower;
    }
}
