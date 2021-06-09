package com.example.codeview.api;

import com.example.codeview.model.channel.Channel;
import com.example.codeview.model.video.VideoAcount;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("videos/{id}")
    Call<VideoAcount>getPost(@Path("id") String id);
    @GET("channels")
    Call<Channel>getChannel(@Query("id_video") String id);

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
