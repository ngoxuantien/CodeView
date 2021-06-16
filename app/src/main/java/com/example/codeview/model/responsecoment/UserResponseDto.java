
package com.example.codeview.model.responsecoment;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserResponseDto {

    @SerializedName("idUser")
    @Expose
    private Integer idUser;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("nickName")
    @Expose
    private String nickName;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("muralPhoto")
    @Expose
    private String muralPhoto;
    @SerializedName("shortBiography")
    @Expose
    private String shortBiography;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMuralPhoto() {
        return muralPhoto;
    }

    public void setMuralPhoto(String muralPhoto) {
        this.muralPhoto = muralPhoto;
    }

    public String getShortBiography() {
        return shortBiography;
    }

    public void setShortBiography(String shortBiography) {
        this.shortBiography = shortBiography;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
