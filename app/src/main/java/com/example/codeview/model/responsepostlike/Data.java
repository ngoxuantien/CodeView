
package com.example.codeview.model.responsepostlike;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("idUserVideo")
    @Expose
    private Integer idUserVideo;
    @SerializedName("isLiked")
    @Expose
    private Boolean isLiked;
    @SerializedName("isWatch")
    @Expose
    private Boolean isWatch;
    @SerializedName("timeWatch")
    @Expose
    private String timeWatch;
    @SerializedName("timeStop")
    @Expose
    private String timeStop;
    @SerializedName("totalTime")
    @Expose
    private String totalTime;
    @SerializedName("createAt")
    @Expose
    private String createAt;
    @SerializedName("updateAt")
    @Expose
    private String updateAt;
    @SerializedName("idVideo")
    @Expose
    private Object idVideo;
    @SerializedName("idUser")
    @Expose
    private Object idUser;

    public Integer getIdUserVideo() {
        return idUserVideo;
    }

    public void setIdUserVideo(Integer idUserVideo) {
        this.idUserVideo = idUserVideo;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsWatch() {
        return isWatch;
    }

    public void setIsWatch(Boolean isWatch) {
        this.isWatch = isWatch;
    }

    public String getTimeWatch() {
        return timeWatch;
    }

    public void setTimeWatch(String timeWatch) {
        this.timeWatch = timeWatch;
    }

    public String getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(String timeStop) {
        this.timeStop = timeStop;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public Object getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Object idVideo) {
        this.idVideo = idVideo;
    }

    public Object getIdUser() {
        return idUser;
    }

    public void setIdUser(Object idUser) {
        this.idUser = idUser;
    }

}
