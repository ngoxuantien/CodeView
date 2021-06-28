
package com.example.codeview.model.channel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

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
    @SerializedName("totalLike")
    @Expose
    private Integer totalLike;
    @SerializedName("totalFollower")
    @Expose
    private Integer totalFollower;
    @SerializedName("totalViews")
    @Expose
    private Integer totalViews;
    @SerializedName("checkFollow")
    @Expose
    private Boolean checkFollow;

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

    public Integer getTotalLike() {
        return totalLike;
    }

    public void setTotalLike(Integer totalLike) {
        this.totalLike = totalLike;
    }

    public Integer getTotalFollower() {
        return totalFollower;
    }

    public void setTotalFollower(Integer totalFollower) {
        this.totalFollower = totalFollower;
    }

    public Integer getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(Integer totalViews) {
        this.totalViews = totalViews;
    }

    public Boolean getCheckFollow() {
        return checkFollow;
    }

    public void setCheckFollow(Boolean checkFollow) {
        this.checkFollow = checkFollow;
    }

}
