
package com.example.codeview.model.Video;


import com.example.codeview.model.Video.Data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VideoAcount {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
