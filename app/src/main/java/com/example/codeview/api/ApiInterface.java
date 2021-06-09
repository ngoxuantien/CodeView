package com.example.codeview.api;

import com.example.codeview.model.Video.VideoAcount;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("videos/1")
    Call<VideoAcount>getPost();

//    @GET("hashtags/12?id_video=2")
//    Call<>getHashtags
//     @GET("comments/video?id_video=1")
//    Call<>getCommentParent
//     @GET("comments/parent?id_parent=1")
//    Call<>getGetComment
//     @POST("comments/like")
//    Call<>postCommentsLike
//     @POST("comments")
//    Call<>postComment

}
