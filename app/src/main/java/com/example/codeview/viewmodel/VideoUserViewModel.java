package com.example.codeview.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.codeview.model.Video.VideoAcount;
import com.example.codeview.repository.MovieRepository;

public class VideoUserViewModel extends AndroidViewModel {
    public MutableLiveData<VideoAcount> videoAcount12 = new MutableLiveData<>();
    private MovieRepository movieRepository = new MovieRepository();
    public VideoUserViewModel(@NonNull Application application) {
        super(application);
    }



    public void getVideoAcount() {
        videoAcount12 = movieRepository.getVideo();


    }
}
