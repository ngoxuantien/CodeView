package com.example.codeview.api;

import com.example.codeview.model.channel.Channel;
import com.example.codeview.model.comment.Comment;
import com.example.codeview.model.comment.CommentPost;
import com.example.codeview.model.hashtag.HashTag;
import com.example.codeview.model.responsecoment.ResponseCommentSend;
import com.example.codeview.model.video.VideoAcount;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("videos/{id}")
    Call<VideoAcount> getPost(@Path("id") String id);

    @GET("channels")
    Call<Channel> getChannel(@Query("id_video") String id);

    @GET("comments/video")
    Call<Comment> getCommentsParent(@Query("id_video") String id ,
                                    @Query("id_user") String iduser);

    @GET("comments/parent")
    Call<Comment> getComments(@Query("id_parent") String id,
                              @Query("id_user") String iduser);

    @GET(" hashtags/12")
    Call<HashTag> getHashTag(@Query("id_video") String id);



    @POST("comments")
    Call<ResponseCommentSend> postComment(@Body CommentPost commentPost);




}
