
package com.example.codeview.model.responsecoment;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VideoResponseDto {

    @SerializedName("idVideo")
    @Expose
    private Integer idVideo;
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("inRecommend")
    @Expose
    private Boolean inRecommend;
    @SerializedName("quality")
    @Expose
    private Object quality;
    @SerializedName("totalLike")
    @Expose
    private Integer totalLike;
    @SerializedName("totalComment")
    @Expose
    private Integer totalComment;
    @SerializedName("timeAverage")
    @Expose
    private Double timeAverage;
    @SerializedName("totalView")
    @Expose
    private Integer totalView;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("createAt")
    @Expose
    private String createAt;
    @SerializedName("updateAt")
    @Expose
    private String updateAt;
    @SerializedName("linkVideo")
    @Expose
    private Object linkVideo;
    @SerializedName("linkHorizontalCoverImage")
    @Expose
    private Object linkHorizontalCoverImage;
    @SerializedName("linkVerticalCoverImage")
    @Expose
    private Object linkVerticalCoverImage;

    public Integer getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getInRecommend() {
        return inRecommend;
    }

    public void setInRecommend(Boolean inRecommend) {
        this.inRecommend = inRecommend;
    }

    public Object getQuality() {
        return quality;
    }

    public void setQuality(Object quality) {
        this.quality = quality;
    }

    public Integer getTotalLike() {
        return totalLike;
    }

    public void setTotalLike(Integer totalLike) {
        this.totalLike = totalLike;
    }

    public Integer getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(Integer totalComment) {
        this.totalComment = totalComment;
    }

    public Double getTimeAverage() {
        return timeAverage;
    }

    public void setTimeAverage(Double timeAverage) {
        this.timeAverage = timeAverage;
    }

    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Object getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(Object linkVideo) {
        this.linkVideo = linkVideo;
    }

    public Object getLinkHorizontalCoverImage() {
        return linkHorizontalCoverImage;
    }

    public void setLinkHorizontalCoverImage(Object linkHorizontalCoverImage) {
        this.linkHorizontalCoverImage = linkHorizontalCoverImage;
    }

    public Object getLinkVerticalCoverImage() {
        return linkVerticalCoverImage;
    }

    public void setLinkVerticalCoverImage(Object linkVerticalCoverImage) {
        this.linkVerticalCoverImage = linkVerticalCoverImage;
    }

}
