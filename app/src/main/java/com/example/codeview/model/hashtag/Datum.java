
package com.example.codeview.model.hashtag;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("idHashTag")
    @Expose
    private Integer idHashTag;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("totalView")
    @Expose
    private Integer totalView;

    public Integer getIdHashTag() {
        return idHashTag;
    }

    public void setIdHashTag(Integer idHashTag) {
        this.idHashTag = idHashTag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTotalView() {
        return totalView;
    }

    public void setTotalView(Integer totalView) {
        this.totalView = totalView;
    }

}
