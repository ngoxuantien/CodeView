package com.example.codeview.api;

import com.example.codeview.model.VideoAcount;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("videos/1")
    Call<VideoAcount>getPost();
}
