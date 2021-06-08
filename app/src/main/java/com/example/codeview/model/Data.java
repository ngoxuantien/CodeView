
package com.example.codeview.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

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
    private Integer timeAverage;
    @SerializedName("totalView")
    @Expose
    private Integer totalView;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("category_id")
    @Expose
    private Integer categoryId;
    @SerializedName("report_id")
    @Expose
    private Integer reportId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("linkVideo")
    @Expose
    private String linkVideo;
    @SerializedName("linkHorizontalCoverImage")
    @Expose
    private String linkHorizontalCoverImage;
    @SerializedName("linkVerticalCoverImage")
    @Expose
    private String linkVerticalCoverImage;

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

    public Integer getTimeAverage() {
        return timeAverage;
    }

    public void setTimeAverage(Integer timeAverage) {
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLinkVideo() {
        return linkVideo;
    }

    public void setLinkVideo(String linkVideo) {
        this.linkVideo = linkVideo;
    }

    public String getLinkHorizontalCoverImage() {
        return linkHorizontalCoverImage;
    }

    public void setLinkHorizontalCoverImage(String linkHorizontalCoverImage) {
        this.linkHorizontalCoverImage = linkHorizontalCoverImage;
    }

    public String getLinkVerticalCoverImage() {
        return linkVerticalCoverImage;
    }

    public void setLinkVerticalCoverImage(String linkVerticalCoverImage) {
        this.linkVerticalCoverImage = linkVerticalCoverImage;
    }

}
