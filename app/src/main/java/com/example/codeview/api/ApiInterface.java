package com.example.codeview.api;

import com.example.codeview.model.channel.Channel;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.putpostmodel.CommentPost;
import com.example.codeview.model.hashtag.HashTag;
import com.example.codeview.model.putpostmodel.Likeput;
import com.example.codeview.model.putpostmodel.PostFollower;
import com.example.codeview.model.putpostmodel.ReportPost;
import com.example.codeview.model.putpostmodel.WhatLatePut;
import com.example.codeview.model.responsecoment.ResponseCommentSend;
import com.example.codeview.model.responsepostfollower.ResponsePostFollower;
import com.example.codeview.model.responsepostlike.ResponsePostLike;
import com.example.codeview.model.responsereport.ResponsePostReport;
import com.example.codeview.model.responsewhatlate.ResponseWhatLate;
import com.example.codeview.model.video.VideoAcount;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("videos/one?")
    Call<VideoAcount> getPost(@Query("id_video") String id,
                              @Query("id_user") String iduser);

    @GET("channels")
    Call<Channel> getChannel(@Query("id_video") String id,
                             @Query("id_user") String iduser);

    @GET("comments/video/{idVideo}")
    Call<Comment> getCommentsParent(@Path("idVideo") String idVideo, @Query("id_user") String iduser,
                                    @Query("offset") int offset,
                                    @Query("limit") int limit);

    @GET("comments/parent/{id_parent}")
    Call<Comment> getComments(@Path("id_parent") String id,
                              @Query("id_user") String iduser,  @Query("offset") int offset,
                              @Query("limit") int limit);

    @GET(" hashtags/12")
    Call<HashTag> getHashTag(@Query("id_video") String id);


    @POST("comments")
    Call<ResponseCommentSend> postComment(@Body CommentPost commentPost);


    @PUT("videos/like")
    Call<ResponsePostLike> putLike(@Body Likeput likeput);


    @PUT("user_video/viewlate")
    Call<ResponseWhatLate> putWhatLate(@Body WhatLatePut whatLatePut);

    @POST("followers/one")
    Call<ResponsePostFollower> postFollowers(@Body PostFollower postFollower);


    @HTTP(method = "DELETE", path = "followers", hasBody = true)
    Call<ResponsePostFollower> deleteFollowers(@Body PostFollower postFollower);


    @POST("reports")
    Call<ResponsePostReport> postReport(@Body ReportPost reportPost);


}
