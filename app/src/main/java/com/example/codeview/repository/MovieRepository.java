package com.example.codeview.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.codeview.api.ApiClient;
import com.example.codeview.api.ApiInterface;
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
import retrofit2.Callback;
import retrofit2.Response;


public class MovieRepository {

    private ApiInterface apiInterface;


    public MovieRepository() {
        apiInterface = ApiClient.getIntance().create(ApiInterface.class);
    }

    public MutableLiveData<VideoAcount> getVideo(String idVideo, String idUser) {
        MutableLiveData<VideoAcount> videoAcountMutableLiveData = new MutableLiveData<>();
        apiInterface.getPost(idVideo, idUser).enqueue(new Callback<VideoAcount>() {
            @Override
            public void onResponse(Call<VideoAcount> call, Response<VideoAcount> response) {
                if (response.isSuccessful()) {
                    videoAcountMutableLiveData.setValue(response.body());
                    //        Log.d("erro", response.body().getData().getLinkVideo());
                }
            }

            @Override
            public void onFailure(Call<VideoAcount> call, Throwable t) {

            }
        });
        return videoAcountMutableLiveData;
    }

    public MutableLiveData<Channel> getChannel(String id, String idUser) {
        MutableLiveData<Channel> channelMutableLiveData = new MutableLiveData<>();
        apiInterface.getChannel(id, idUser).enqueue(new Callback<Channel>() {
            @Override
            public void onResponse(Call<Channel> call, Response<Channel> response) {
                if ((response.isSuccessful())) {
                    channelMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Channel> call, Throwable t) {

            }
        });
        return channelMutableLiveData;
    }

    public MutableLiveData<Comment> getCommentsParent(String id, String idUser) {
        MutableLiveData<Comment> commentMutableLiveData = new MutableLiveData<>();
        apiInterface.getCommentsParent().enqueue(new Callback<Comment>() {
            @Override
            public void onResponse(Call<Comment> call, Response<Comment> response) {
                if (response.isSuccessful()) {
                    commentMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Comment> call, Throwable t) {

            }
        });
        return commentMutableLiveData;
    }

    public MutableLiveData<Comment> getComment(String id, String idUser) {
        MutableLiveData<Comment> commentMutableLiveData = new MutableLiveData<>();
        apiInterface.getComments(id, idUser).enqueue(new Callback<Comment>() {
            @Override
            public void onResponse(Call<Comment> call, Response<Comment> response) {
                if (response.isSuccessful()) {
                    commentMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Comment> call, Throwable t) {

            }
        });
        return commentMutableLiveData;
    }

    public MutableLiveData<HashTag> getHashTag(String id) {
        MutableLiveData<HashTag> hashTagMutableLiveData = new MutableLiveData<>();
        apiInterface.getHashTag(id).enqueue(new Callback<HashTag>() {
            @Override
            public void onResponse(Call<HashTag> call, Response<HashTag> response) {
                if (response.isSuccessful()) {
                    hashTagMutableLiveData.setValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<HashTag> call, Throwable t) {

            }
        });
        return hashTagMutableLiveData;
    }

    public void postComment(CommentPost commentPost) {
        apiInterface.postComment(commentPost).enqueue(new Callback<ResponseCommentSend>() {
            @Override
            public void onResponse(Call<ResponseCommentSend> call, Response<ResponseCommentSend> response) {
                Log.d("ddd", response.body().getMessage());
            }

            @Override
            public void onFailure(Call<ResponseCommentSend> call, Throwable t) {

            }
        });


    }

    public void putLike(Likeput likeput) {
        apiInterface.putLike(likeput).enqueue(new Callback<ResponsePostLike>() {
            @Override
            public void onResponse(Call<ResponsePostLike> call, Response<ResponsePostLike> response) {
                Log.d("loi put like", response.body().getMessage());
            }

            @Override
            public void onFailure(Call<ResponsePostLike> call, Throwable t) {
                Log.d("loi put like", t.getMessage());
            }
        });
    }

    public void putWhatLate(WhatLatePut whatLatePut) {
        apiInterface.putWhatLate(whatLatePut).enqueue(new Callback<ResponseWhatLate>() {
            @Override
            public void onResponse(Call<ResponseWhatLate> call, Response<ResponseWhatLate> response) {

            }

            @Override
            public void onFailure(Call<ResponseWhatLate> call, Throwable t) {

            }
        });
    }


    public void postFollower(PostFollower postFollower) {
        apiInterface.postFollowers(postFollower).enqueue(new Callback<ResponsePostFollower>() {
            @Override
            public void onResponse(Call<ResponsePostFollower> call, Response<ResponsePostFollower> response) {

            }

            @Override
            public void onFailure(Call<ResponsePostFollower> call, Throwable t) {

            }
        });
    }

    public void deleteFollower(PostFollower postFollower) {
        apiInterface.deleteFollowers(postFollower).enqueue(new Callback<ResponsePostFollower>() {
            @Override
            public void onResponse(Call<ResponsePostFollower> call, Response<ResponsePostFollower> response) {

            }

            @Override
            public void onFailure(Call<ResponsePostFollower> call, Throwable t) {

            }
        });
    }

    public void postReport(ReportPost reportPost) {
        apiInterface.postReport(reportPost).enqueue(new Callback<ResponsePostReport>() {
            @Override
            public void onResponse(Call<ResponsePostReport> call, Response<ResponsePostReport> response) {
                Log.d("messs", response.body().getMessage());
            }

            @Override
            public void onFailure(Call<ResponsePostReport> call, Throwable t) {

            }
        });
    }


}
