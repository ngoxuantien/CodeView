package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.codeview.model.channel.Channel;
import com.example.codeview.model.hashtag.HashTag;
import com.example.codeview.model.video.VideoAcount;
import com.example.codeview.repository.MovieRepository;

public class VideoUserViewModel extends AndroidViewModel {
    public MutableLiveData<VideoAcount> videoAcount12 = new MutableLiveData<>();
    public MutableLiveData<Channel> channel= new MutableLiveData<>();
public MutableLiveData<HashTag> hashTag= new MutableLiveData<>();


    private MovieRepository movieRepository = new MovieRepository();

    public VideoUserViewModel(@NonNull Application application) {
        super(application);
    }



    public void getVideoAcount(String id) {
        videoAcount12 = movieRepository.getVideo(id);
    }
    public void getChannelVideo(String id){
        channel= movieRepository.getChannel(id);
    }

    public void getHashTag(String id){
        hashTag=movieRepository.getHashTag(id);
    }



}
