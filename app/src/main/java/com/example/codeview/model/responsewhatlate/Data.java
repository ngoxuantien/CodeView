
package com.example.codeview.model.responsewhatlate;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("idUserVideo")
    @Expose
    private Integer idUserVideo;
    @SerializedName("timeWatch")
    @Expose
    private Object timeWatch;
    @SerializedName("timeStop")
    @Expose
    private Object timeStop;
    @SerializedName("totalTime")
    @Expose
    private Object totalTime;
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
    @SerializedName("liked")
    @Expose
    private Boolean liked;
    @SerializedName("watch")
    @Expose
    private Boolean watch;
    @SerializedName("watchLater")
    @Expose
    private Boolean watchLater;

    public Integer getIdUserVideo() {
        return idUserVideo;
    }

    public void setIdUserVideo(Integer idUserVideo) {
        this.idUserVideo = idUserVideo;
    }

    public Object getTimeWatch() {
        return timeWatch;
    }

    public void setTimeWatch(Object timeWatch) {
        this.timeWatch = timeWatch;
    }

    public Object getTimeStop() {
        return timeStop;
    }

    public void setTimeStop(Object timeStop) {
        this.timeStop = timeStop;
    }

    public Object getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Object totalTime) {
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

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public Boolean getWatch() {
        return watch;
    }

    public void setWatch(Boolean watch) {
        this.watch = watch;
    }

    public Boolean getWatchLater() {
        return watchLater;
    }

    public void setWatchLater(Boolean watchLater) {
        this.watchLater = watchLater;
    }

}
