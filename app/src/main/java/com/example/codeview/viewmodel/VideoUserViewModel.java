package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.codeview.model.channel.Channel;
import com.example.codeview.model.hashtag.HashTag;
import com.example.codeview.model.putpostmodel.Likeput;
import com.example.codeview.model.putpostmodel.PostFollower;
import com.example.codeview.model.putpostmodel.WhatLatePut;
import com.example.codeview.model.video.VideoAcount;
import com.example.codeview.repository.MovieRepository;

public class VideoUserViewModel extends AndroidViewModel {
    public MutableLiveData<VideoAcount> videoAcount12 = new MutableLiveData<>();
    public MutableLiveData<Channel> channel = new MutableLiveData<>();
    public MutableLiveData<HashTag> hashTag = new MutableLiveData<>();


    private MovieRepository movieRepository = new MovieRepository();

    public VideoUserViewModel(@NonNull Application application) {
        super(application);
    }






    public int getIdvideo() {
        return videoAcount12.getValue().getData().getIdVideo();
    }


    public void getVideoAcount(String idVideo, String idUser) {
        videoAcount12 = movieRepository.getVideo(idVideo, idUser);
    }

    public void getChannelVideo(String id,String idUser) {
        channel = movieRepository.getChannel(id,idUser);
    }

    public void getHashTag(String id) {
        hashTag = movieRepository.getHashTag(id);
    }

    public void putLike(Likeput likeput) {
        movieRepository.putLike(likeput);
    }

    public void putWhatLate(WhatLatePut whatLatePut) {
        movieRepository.putWhatLate(whatLatePut);
    }

    public void postFollower(PostFollower postFollower) {
        movieRepository.postFollower(postFollower);
    }
    public void deleteFollower(PostFollower postFollower){
        movieRepository.deleteFollower(postFollower);
    }


}
